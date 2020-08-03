package com.wrx.js.web.repository.pg;

import com.wrx.js.web.model.AccountModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author jiaosong
 * @desc
 * @date 2020/8/2
 */
@Repository
public interface AccountRepository {
    /**
     * 根据密钥查找用户
     *
     * @param secret
     * @return
     */
    @Select("select * from t_account where \"Secret\" =#{secret}")
    AccountModel findBySecret(@Param("secret") String secret);
}
