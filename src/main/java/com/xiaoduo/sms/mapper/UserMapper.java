package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 用户Repository接口
 *
 */
//@Repository
//@Resource(name = "userMapper")
@Mapper
@Component("userMapper")
public interface UserMapper {

	/**
	 * 根据用户名查找用户实体
	 * @param userName
	 * @return
	 */
	User findByUserName(
			@Param("userName") String userName);

}
