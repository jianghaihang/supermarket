package com.xiaoduo.sms;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author 小舵
 * @program: sms
 * @description: 描述 springboot启动初始化
 * @time 2019/11/12 21:04
 */

public class SmsInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        return builder.sources(SmsApplication.class);
    }
}
