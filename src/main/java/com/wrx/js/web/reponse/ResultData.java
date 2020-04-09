package com.wrx.js.web.reponse;

import com.wrx.js.web.enums.ResultCodeEnum;

import java.io.Serializable;

/**
 * @author jiaosong
 * @desc 返回实体类
 * @date 2020/4/6
 */
public class ResultData implements Serializable {
    private static final long serialVersionUID = -798269607518554107L;

    /**
     * 返回码
     */
    private ResultCodeEnum code;

    /**
     * 信息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;

    private ResultData(ResultCodeEnum code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultData of(Object data) {
        return new ResultData(ResultCodeEnum.SUCCESS, null, data);
    }

    public ResultCodeEnum getCode() {
        return code;
    }

    public void setCode(ResultCodeEnum code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
