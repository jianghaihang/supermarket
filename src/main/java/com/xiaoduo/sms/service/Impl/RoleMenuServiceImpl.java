package com.xiaoduo.sms.service.Impl;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.RoleMenu;
import com.xiaoduo.sms.mapper.RoleMenuMapper;
import com.xiaoduo.sms.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 角色权限菜单关联Service实现类
 */
@Service
@Transactional
public class RoleMenuServiceImpl implements RoleMenuService {

	@Autowired
	private RoleMenuMapper roleMenuMapper;

	@Override
	public void deleteByRoleId(Integer roleId) {
		roleMenuMapper.deleteByRoleId(roleId);
	}

	@Override
	public void save(RoleMenu roleMenu) {

//		roleMenuMapper.save(roleMenu);

	}
	
	
}
