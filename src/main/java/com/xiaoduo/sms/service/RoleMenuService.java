package com.xiaoduo.sms.service;

import com.xiaoduo.sms.entity.RoleMenu;
import org.springframework.stereotype.Component;

/**
 * 角色权限关联Service接口
 *
 */
@Component("roleMenuService")
public interface RoleMenuService {

	/**
	 * 根据角色id删除所有关联信息
//	 * @param id
	 */
	 void deleteByRoleId(Integer roleId);
	
	/**
	 * 保存
	 * @param roleMenu
	 */
	 void save(RoleMenu roleMenu);
}
