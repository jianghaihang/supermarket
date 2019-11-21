package com.xiaoduo.sms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 进货单Repository接口
 * @author Administrator
 *
 */
@Mapper
@Component("purchaseListMapper")
public interface PurchaseListMapper {

	/**
	 * 获取当天最大进货单号
	 * @return
	 */
//	@Query(value="SELECT MAX(purchase_number) FROM t_purchase_list WHERE TO_DAYS(purchase_date) = TO_DAYS(NOW())",nativeQuery=true)
	String getTodayMaxPurchaseNumber();
}
