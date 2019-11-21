package com.xiaoduo.sms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 角色权限菜单Repository接口
 */
@Mapper
@Component("roleMenuMapper")
public interface RoleMenuMapper {

	/**
	 * 根据用户id删除所有关联信息
//	 * @param id
	 */
//	@Query(value="delete from t_role_menu where role_id=?1",nativeQuery=true)
//	@Modifying
	public void deleteByRoleId(Integer roleId);
}
