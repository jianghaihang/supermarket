package com.xiaoduo.sms.entity;

import java.io.Serializable;

/**
 * 销售统计
 */
public class SaleCount implements Serializable {

	private static final long serialVersionUID = 8671134068096034600L;

	private float amountCost; // 成本总金额
	
	private float amountSale; // 销售总金额
	
	private float amountProfit; // 销售利润
	
	private String date; // 日期

	public float getAmountCost() {
		return amountCost;
	}

	public void setAmountCost(float amountCost) {
		this.amountCost = amountCost;
	}

	public float getAmountSale() {
		return amountSale;
	}

	public void setAmountSale(float amountSale) {
		this.amountSale = amountSale;
	}
	

	public float getAmountProfit() {
		return amountProfit;
	}

	public void setAmountProfit(float amountProfit) {
		this.amountProfit = amountProfit;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
