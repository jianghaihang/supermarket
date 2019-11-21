package com.xiaoduo.sms.service.Impl;


import javax.annotation.Resource;

import com.xiaoduo.sms.entity.UserRole;
import com.xiaoduo.sms.mapper.UserRoleMapper;
import com.xiaoduo.sms.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户角色关联Service实现类
 */
@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleMapper userRoleMapper;
	
	@Override
	public void save(UserRole userRole) {

//		userRoleMapper.save(userRole);
	}

	@Override
	public void delete(UserRole userRole) {

//		userRoleMapper.delete(userRole);
	}

	@Override
	public UserRole findById(Integer id) {

//		return userRoleMapper.findOne(id);

		return null;
	}

	@Override
	public void deleteByUserId(Integer userId) {

		userRoleMapper.deleteByUserId(userId);
	}

	@Override
	public void deleteByRoleId(Integer userId) {

		userRoleMapper.deleteByRoleId(userId);
	}

	

}
