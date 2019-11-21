package com.xiaoduo.sms.service;

import java.util.List;

import com.xiaoduo.sms.entity.PurchaseList;
import com.xiaoduo.sms.entity.PurchaseListGoods;
import org.springframework.stereotype.Component;


/**
 * 进货单Service接口
 */
@Component("purchaseListService")
public interface PurchaseListService {

	/**
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	 PurchaseList findById(Integer id);
	
	/**
	 * 获取当天最大进货单号
	 * @return
	 */
	 String getTodayMaxPurchaseNumber();
	
	/**
	 * 添加进货单 以及所有进货单商品 以及 修改商品的成本均价
	 * @param purchaseList 进货单
//	 * @param PurchaseListGoodsList 进货单商品
	 */
	 void save(PurchaseList purchaseList, List<PurchaseListGoods> purchaseListGoodsList);
	
	/**
	 * 根据条件查询进货单信息
	 * @param purchaseList
	 * @param page
	 * @param pageSize
	 * @param direction
	 * @param properties
	 * @return
	 */
//	public List<PurchaseList> list(PurchaseList purchaseList, Direction direction, String... properties);
	
	/**
	 * 根据id删除进货单信息 包括进货单里的商品
	 * @param id
	 */
	 void delete(Integer id);
	
	/**
	 * 更新进货单
	 * @param purchaseList
	 */
	 void update(PurchaseList purchaseList);

}
