package com.xiaoduo.sms.service;

import java.util.List;

import com.xiaoduo.sms.entity.DamageList;
import com.xiaoduo.sms.entity.DamageListGoods;
import org.springframework.stereotype.Component;

/**
 * 报损单Service接口
 */
@Component("damageListService")
public interface DamageListService {

	/**
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	public DamageList findById(Integer id);
	
	/**
	 * 获取当天最大报损单号
	 * @return
	 */
	public String getTodayMaxDamageNumber();
	
	/**
	 * 添加报损单 以及所有报损单商品 以及 修改商品的成本均价
	 * @param damageList 报损单
//	 * @param DamageListGoodsList 报损单商品
	 */
	public void save(DamageList damageList, List<DamageListGoods> damageListGoodsList);
	
	/**
	 * 根据条件查询报损单信息
	 * @param damageList
//	 * @param page
//	 * @param pageSize
	 * @param direction
	 * @param properties
	 * @return
	 */
//	public List<DamageList> list(DamageList damageList, Direction direction, String... properties);
	
	/**
	 * 根据id删除报损单信息 包括报损单里的商品
	 * @param id
	 */
	public void delete(Integer id);

}
