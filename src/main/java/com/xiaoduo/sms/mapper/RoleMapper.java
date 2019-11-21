package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 角色Repository接口
 */
@Mapper
@Component("roleMapper")
public interface RoleMapper {

	/**
	 * 根据用户id查询角色集合
	 * @param id
	 * @return
	 */
//	@Query(value="SELECT r.* FROM t_user u,t_role r,t_user_role ur WHERE ur.user_id=u.`id` AND ur.role_id=r.`id` AND u.`id`=?1",nativeQuery=true)
	List<Role> findByUserId(Integer id);
	

	
}
