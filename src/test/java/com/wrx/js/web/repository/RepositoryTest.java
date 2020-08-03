package com.wrx.js.web.repository;

import com.wrx.js.web.WebApplicationTests;
import com.wrx.js.web.model.AccountModel;
import com.wrx.js.web.repository.mysql.TeacherInfoRepository;
import com.wrx.js.web.repository.pg.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jiaosong
 * @desc
 * @date 2020/8/1
 */
@Slf4j
public class RepositoryTest extends WebApplicationTests {

    @Autowired
    private AccountRepository mAccountRepository;

    @Autowired
    private TeacherInfoRepository mTeacherInfoRepository;


    @Test
    public void getAccountBySecretTest() {
        AccountModel bySecret = mAccountRepository.findBySecret("295e8b53de414ee09ff695e29bf9a0a1");
        log.info("result:{}", bySecret);
    }


    @Test
    public void getTeacherInfoByIdTest() {
        Object byTeacherId = mTeacherInfoRepository.findByTeacherId(2);
        log.info("result:{}", byTeacherId);
    }
}
