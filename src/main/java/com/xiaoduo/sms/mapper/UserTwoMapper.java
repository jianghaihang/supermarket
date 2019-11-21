package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.UserTwo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component("userTwoMapper")
public interface UserTwoMapper {

    UserTwo getUserByUserName(
            @Param("uname") String uname);
}
