package com.xiaoduo.sms.entity;

import java.io.Serializable;

/**
 * 退货单商品实体
 *
 */
public class ReturnListGoods implements Serializable {

	private static final long serialVersionUID = -6080598683035906396L;

	private Integer id; // 编号
	
	private ReturnList returnList; // 退货单

	private String code; // 商品编码
	
	private String name; // 商品名称
	
	private String model; // 商品型号
	
	private GoodsType type; // 商品类别
	
	private Integer typeId; // 类别id
	
	private Integer goodsId; // 商品id
	
	private String unit; // 商品单位
	
	private float price; // 单价
	
	private int num; // 数量查询用到  根据商品编码或者商品名称查询
	
	private float total; // 总价

	private String codeOrName; //

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
	
	
	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	
	public ReturnList getReturnList() {
		return returnList;
	}

	public void setReturnList(ReturnList returnList) {
		this.returnList = returnList;
	}
	
	

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	

	public String getCodeOrName() {
		return codeOrName;
	}

	public void setCodeOrName(String codeOrName) {
		this.codeOrName = codeOrName;
	}

	@Override
	public String toString() {
		return "ReturnListGoods [id=" + id + ", code=" + code + ", name=" + name + ", model=" + model + ", type="
				+ type + ", unit=" + unit + ", price=" + price + ", num=" + num + ", total=" + total + "]";
	}

	
	
}
