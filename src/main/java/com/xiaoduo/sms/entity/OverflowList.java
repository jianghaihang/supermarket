package com.xiaoduo.sms.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Date;

/**
 * 报溢单
 */
public class OverflowList implements Serializable {

	private static final long serialVersionUID = 1620931423138788261L;

	private Integer id; // 编号
	
	private String overflowNumber; // 报溢单号
	
	private Date overflowDate; // 报溢日期
	
	private Date bOverflowDate; // 起始时间 搜索用到
	
	private Date eOverflowDate; // 结束时间 搜索用到
	
	
	private User user; // 操作用户
	
	private String remarks; // 备注

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getOverflowNumber() {
		return overflowNumber;
	}

	public void setOverflowNumber(String overflowNumber) {
		this.overflowNumber = overflowNumber;
	}

	

	@JsonSerialize(using=CustomDateSerializer.class)
	public Date getOverflowDate() {
		return overflowDate;
	}

	public void setOverflowDate(Date overflowDate) {
		this.overflowDate = overflowDate;
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

	public Date getbOverflowDate() {
		return bOverflowDate;
	}

	public void setbOverflowDate(Date bOverflowDate) {
		this.bOverflowDate = bOverflowDate;
	}

	public Date geteOverflowDate() {
		return eOverflowDate;
	}

	public void seteOverflowDate(Date eOverflowDate) {
		this.eOverflowDate = eOverflowDate;
	}

	@Override
	public String toString() {
		return "OverflowList [id=" + id + ", overflowNumber=" + overflowNumber + ", overflowDate=" + overflowDate
				+ ", bOverflowDate=" + bOverflowDate + ", eOverflowDate=" + eOverflowDate + ", user=" + user
				+ ", remarks=" + remarks + "]";
	}

	
	
	
}
