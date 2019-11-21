package com.xiaoduo.sms.service;

import com.xiaoduo.sms.entity.DamageListGoods;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 报损单商品Service接口
 * @author java1234_小锋老师
 *
 */
@Component("damageListGoodsService")
public interface DamageListGoodsService {

	/**
	 * 根据报损单id查询所有报损单商品
	 * @param damageListId
	 * @return
	 */
	public List<DamageListGoods> listByDamageListId(Integer damageListId);


}
