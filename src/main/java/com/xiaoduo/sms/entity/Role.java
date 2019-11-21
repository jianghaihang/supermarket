package com.xiaoduo.sms.entity;

import java.io.Serializable;

/**
 * 角色实体
 */
public class Role implements Serializable {

	private static final long serialVersionUID = -2189339868816265131L;

	private Integer id; // 编号
	
	private String name; // 角色名称
	
	private String remarks; // 备注

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", remarks=" + remarks + "]";
	}

	
	
	
}
