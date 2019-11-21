package com.xiaoduo.sms.service.Impl;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.Menu;
import com.xiaoduo.sms.mapper.MenuMapper;
import com.xiaoduo.sms.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 权限菜单Service实现类
 */
@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuMapper menuMapper;

	@Override
	public List<Menu> findByRoleId(int roleId) {

		return menuMapper.findByRoleId(roleId);
	}

	@Override
	public List<Menu> findByParentIdAndRoleId(int parentId, int roleId) {

		return menuMapper.findByParentIdAndRoleId(parentId, roleId);
	}

	@Override
	public List<Menu> findByParentId(int parentId) {

		return menuMapper.findByParentId(parentId);
	}

	@Override
	public Menu findById(Integer id) {

//		return menuMapper.findOne(id);

		return  null;
	}

}
