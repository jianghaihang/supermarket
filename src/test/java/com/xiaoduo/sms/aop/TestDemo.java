package com.xiaoduo.sms.aop;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 小舵
 * @program: sms
 * @description: 描述 tset
 * @time 2019/11/16 16:16
 */

public class TestDemo {

    public static void main(String[] args) throws IOException {

        InputStream input = TestDemo.class.getClassLoader().getResourceAsStream("test.txt");

        System.out.println(input);

        input.close();
    }
}
