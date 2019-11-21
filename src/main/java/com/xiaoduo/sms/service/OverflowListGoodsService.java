package com.xiaoduo.sms.service;

import com.xiaoduo.sms.entity.OverflowListGoods;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 报溢单商品Service接口
 */
@Component("overflowListGoodsService")
public interface OverflowListGoodsService {

	/**
	 * 根据报溢单id查询所有报溢单商品
	 * @param overflowListId
	 * @return
	 */
	public List<OverflowListGoods> listByOverflowListId(Integer overflowListId);


}
