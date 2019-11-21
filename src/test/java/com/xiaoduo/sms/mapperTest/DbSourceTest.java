package com.xiaoduo.sms.mapperTest;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author 小舵
 * @program: sms
 * @description: 描述 数据库连接测试
 * @time 2019/11/16 12:43
 */

public class DbSourceTest {

    @Test
    public void dbSource() throws SQLException {

        AbstractApplicationContext aac = new ClassPathXmlApplicationContext("spring-dao.xml");

        DataSource dataSource = aac.getBean("dbSource", DataSource.class);

        System.out.println("dataSource" + dataSource.getConnection());

        aac.close();

    }
}
