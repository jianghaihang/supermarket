package com.xiaoduo.sms.entity;

import java.io.Serializable;

/**
 * 用户角色关联实体
 */
public class UserRole implements Serializable {

	private static final long serialVersionUID = 8040077220303114143L;

	private Integer id; // 编号
	
	private User user; // 用户
	
	private Role role; // 角色

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", user=" + user + ", role=" + role + "]";
	}
	
	
	
}
