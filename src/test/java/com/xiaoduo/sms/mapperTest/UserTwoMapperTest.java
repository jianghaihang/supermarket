package com.xiaoduo.sms.mapperTest;

import com.xiaoduo.sms.config.ShiroConfig;
import com.xiaoduo.sms.entity.UserTwo;
import com.xiaoduo.sms.mapper.UserTwoMapper;
import com.xiaoduo.sms.realm.MyRealm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * @author 小舵
 * @program: sms
 * @description: 描述 测试
 * @time 2019/11/15 18:07
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class UserTwoMapperTest {

    @Autowired
    @Qualifier("userTwoMapper")
    private UserTwoMapper userTwoMapper;

    @Test
    public void getUserByUname(){

        System.out.println("userTwoMapper: " + userTwoMapper);

        UserTwo user = userTwoMapper.getUserByUserName("admin");

        System.out.println("user: " + user);
    }
}
