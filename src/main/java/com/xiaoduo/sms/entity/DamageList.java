package com.xiaoduo.sms.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Date;

/**
 * 报损单
 *
 */
public class DamageList implements Serializable {

	private static final long serialVersionUID = -5986815969777938177L;

	private Integer id; // 编号
	
	private String damageNumber; // 报损单号

	private Date damageDate; // 报损日期
	
	private Date bDamageDate; // 起始时间 搜索用到
	
	private Date eDamageDate; // 结束时间 搜索用到

	private User user; // 操作用户
	
	private String remarks; // 备注

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getDamageNumber() {
		return damageNumber;
	}

	public void setDamageNumber(String damageNumber) {
		this.damageNumber = damageNumber;
	}

	

	@JsonSerialize(using=CustomDateSerializer.class)
	public Date getDamageDate() {
		return damageDate;
	}

	public void setDamageDate(Date damageDate) {
		this.damageDate = damageDate;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getbDamageDate() {
		return bDamageDate;
	}

	public void setbDamageDate(Date bDamageDate) {
		this.bDamageDate = bDamageDate;
	}

	public Date geteDamageDate() {
		return eDamageDate;
	}

	public void seteDamageDate(Date eDamageDate) {
		this.eDamageDate = eDamageDate;
	}

	@Override
	public String toString() {
		return "DamageList [id=" + id + ", damageNumber=" + damageNumber + ", damageDate=" + damageDate
				+ ", bDamageDate=" + bDamageDate + ", eDamageDate=" + eDamageDate + ", user=" + user + ", remarks="
				+ remarks + "]";
	}

	
	
	
	
}
