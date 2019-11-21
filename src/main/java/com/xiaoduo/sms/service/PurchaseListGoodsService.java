package com.xiaoduo.sms.service;

import java.util.List;

import com.xiaoduo.sms.entity.PurchaseListGoods;
import org.springframework.stereotype.Component;

/**
 * 进货单商品Service接口
 */
@Component("purchaseListGoodsService")
public interface PurchaseListGoodsService {

	/**
	 * 根据进货单id查询所有进货单商品
	 * @param purchaseListId
	 * @return
	 */
	public List<PurchaseListGoods> listByPurchaseListId(Integer purchaseListId);
	
	/**
	 * 根据条件查询进货单商品
//	 * @param PurchaseListGoods
	 * @return
	 */
	public List<PurchaseListGoods> list(PurchaseListGoods purchaseListGoods);


}
