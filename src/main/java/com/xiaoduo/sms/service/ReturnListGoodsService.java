package com.xiaoduo.sms.service;

import java.util.List;

import com.xiaoduo.sms.entity.ReturnListGoods;
import org.springframework.stereotype.Component;

/**
 * 退货单商品Service接口
 */
@Component("returnListGoodsService")
public interface ReturnListGoodsService {

	/**
	 * 根据退货单id查询所有退货单商品
	 * @param returnListId
	 * @return
	 */
	 List<ReturnListGoods> listByReturnListId(Integer returnListId);

	/**
	 * 根据条件查询退货单所有商品
	 * @param returnListGoods
	 * @return
	 */
	 List<ReturnListGoods> list(ReturnListGoods returnListGoods);
}
