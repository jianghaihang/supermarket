package com.xiaoduo.sms.entity;

import java.io.Serializable;

/**
 * 商品实体
 *
 */
public class Goods implements Serializable {

	private static final long serialVersionUID = -267563115547667327L;

	private Integer id; // 编号

	private String code; // 商品编码
	
	private String name; // 商品名称
	
	private String model; // 商品型号
	
	private GoodsType type; // 商品类别
	
	private String unit; // 商品单位
	
	private float lastPurchasingPrice; // 上次采购价格
	
	private float purchasingPrice; // 采购价格 成本价 如价格变动 算平均值
	
	private float sellingPrice; // 出售价格
	
	private int inventoryQuantity; // 库存数量
	
	private int minNum; // 库存下限
	
	private int state; // 0 初始化状态  1 期初库存入仓库  2 有进货或者销售单据 
	
	private int saleTotal; // 销售总数

	private String producer; // 生产产商
	
	private String remarks; // 备注
	
	private String codeOrName; // 查询用到  根据商品编码或者商品名称查询

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public GoodsType getType() {
		return type;
	}

	public void setType(GoodsType type) {
		this.type = type;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public float getPurchasingPrice() {
		return purchasingPrice;
	}

	public void setPurchasingPrice(float purchasingPrice) {
		this.purchasingPrice = purchasingPrice;
	}

	public float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getInventoryQuantity() {
		return inventoryQuantity;
	}

	public void setInventoryQuantity(int inventoryQuantity) {
		this.inventoryQuantity = inventoryQuantity;
	}

	public int getMinNum() {
		return minNum;
	}

	public void setMinNum(int minNum) {
		this.minNum = minNum;
	}


	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	

	public float getLastPurchasingPrice() {
		return lastPurchasingPrice;
	}

	public void setLastPurchasingPrice(float lastPurchasingPrice) {
		this.lastPurchasingPrice = lastPurchasingPrice;
	}
	
	
	public String getCodeOrName() {
		return codeOrName;
	}

	public void setCodeOrName(String codeOrName) {
		this.codeOrName = codeOrName;
	}
	
	

	public int getSaleTotal() {
		return saleTotal;
	}

	public void setSaleTotal(int saleTotal) {
		this.saleTotal = saleTotal;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", code=" + code + ", name=" + name + ", model=" + model 
				+ ", unit=" + unit + ", purchasingPrice=" + purchasingPrice + ", sellingPrice=" + sellingPrice
				+ ", inventoryQuantity=" + inventoryQuantity + ", minNum=" + minNum + ", producer=" + producer
				+ ", remarks=" + remarks + "]";
	}
	
	
}
