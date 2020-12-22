package com.wrx.js.web.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author jiaosong
 * @desc
 * @date 2020/8/6
 */
@Component
public class WatcherTask {

    @Scheduled(cron = "0/5 * * * * ?")
    private void task() {
        System.out.println("task execute");
    }
}
