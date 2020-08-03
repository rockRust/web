package com.wrx.js.web.model;

import lombok.Data;

/**
 * @author jiaosong
 * @desc 账户信息
 * @date 2020/7/31
 */
@Data
public class AccountModel {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 所属租户（企业）id
     */
    private Integer tenantId;
    /**
     * 账号类型（10: 主账号, 11: 子账号）
     */
    private Integer accountType;

    /**
     * 状态
     */
    private Integer status;
    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 真实姓名
     */
    private String realName;



}
