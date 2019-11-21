package com.xiaoduo.sms.entity;

import java.io.Serializable;

/**
 * 角色菜单关联实体
 */
public class RoleMenu implements Serializable {

	private static final long serialVersionUID = 4089262520985936418L;

	private Integer id; // 编号

	private Role role; // 角色
	
	private Menu menu; // 菜单
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "RoleMenu [id=" + id + ", role=" + role + ", menu=" + menu + "]";
	}
	
	
}
