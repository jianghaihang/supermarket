package com.xiaoduo.sms.service;

import com.xiaoduo.sms.entity.GoodsUnit;

import java.util.List;

/**
 * 商品单位Service接口
 * @author java1234 小锋 老师
 *
 */
public interface GoodsUnitService {

	/**
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	public GoodsUnit findById(Integer id);
	
	/**
	 * 查询所有商品单位信息
	 * @return
	 */
	public List<GoodsUnit> listAll();
	
	/**
	 * 修改或者修改商品单位信息
//	 * @param goods
	 */
	public void save(GoodsUnit goodsUnit);
	
	/**
	 * 根据id删除商品单位
	 * @param id
	 */
	public void delete(Integer id);
}
