package com.xiaoduo.sms.service;

import java.util.List;

import com.xiaoduo.sms.entity.CustomerReturnListGoods;
import org.springframework.stereotype.Component;

/**
 * 客户退货单商品Service接口
 */
@Component("customerReturnListGoodsService")
public interface CustomerReturnListGoodsService {

	/**
	 * 根据客户退货单id查询所有客户退货单商品
	 * @param customerReturnListId
	 * @return
	 */
	public List<CustomerReturnListGoods> listByCustomerReturnListId(Integer customerReturnListId);

	/**
	 * 统计某个商品的客户退货总量
	 * @param goodsId
	 * @return
	 */
	public Integer getTotalByGoodsId(Integer goodsId);
	
	/**
	 * 根据条件查询客户退货单商品
	 * @param customerReturnListGoods
	 * @return
	 */
	public List<CustomerReturnListGoods> list(CustomerReturnListGoods customerReturnListGoods);
	
	
}
