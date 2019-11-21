package com.xiaoduo.sms.mapperTest;

//import com.xiaoduo.sms.config.ShiroConfig;
import com.xiaoduo.sms.entity.User;
import com.xiaoduo.sms.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author 小舵
 * @program: sms
 * @description: 描述 用户测试
 * @time 2019/11/14 13:10
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = SmsApplicationTests.class)

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = ShiroConfig.class)
public class UserMapperTestCase {

    //    @Autowired(required = true)
//    @Resource
//    @Qualifier("userMapper")
//    @Autowired(required = false)@Qualifier("userMapper")
    @Autowired
    private UserMapper userMapper;

    @Test
    public void findUserByUname(){

        System.err.println("userMapper : " + userMapper + " | " + userMapper.getClass() + " | " + userMapper.toString());

        try {

            User user = userMapper.findByUserName("admin");

            System.err.println(user);

        }catch (Exception e){

            System.err.println(e.getMessage());

            System.out.println("userMapper 出错了!");
        }

    }
}



























