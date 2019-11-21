package com.xiaoduo.sms.aop;

import java.io.IOException;
import java.io.InputStream;

public class AspectTestDemo {

    public static void main(String[] args) throws IOException {

        InputStream input = AspectTestDemo.class.getClassLoader().getResourceAsStream("application.properties");

        System.out.printf("input: " + input);

        input.close();
    }
}
