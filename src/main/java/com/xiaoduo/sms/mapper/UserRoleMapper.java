package com.xiaoduo.sms.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 用户角色关联Repository接口
 *
 */
@Mapper
@Component("userRoleMapper")
public interface UserRoleMapper {


	
	/**
	 * 根据用户id删除所有关联信息
	 * @param userId
	 */
//	@Query(value="delete from t_user_role where user_id=?1",nativeQuery=true)
//	@Modifying
	void deleteByUserId(Integer userId);
	
	
	/**
	 * 根据角色id删除所有关联信息
//	 * @param id
	 */
//	@Query(value="delete from t_user_role where role_id=?1",nativeQuery=true)
//	@Modifying
	void deleteByRoleId(Integer roleId);
}
