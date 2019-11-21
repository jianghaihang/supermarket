package com.xiaoduo.sms.entity;

import java.io.Serializable;

/**
 * 商品单位实体
 */
public class GoodsUnit implements Serializable {

	private static final long serialVersionUID = -1651362755018158755L;

	private Integer id; // 编号
	
	private String name; // 商品单位名称

	
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

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
	
	
}
