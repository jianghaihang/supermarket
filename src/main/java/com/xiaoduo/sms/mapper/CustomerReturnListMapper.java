package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.CustomerReturnListGoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 客户退货单Repository接口
 * @author Administrator
 *
 */
@Mapper
@Component("customerReturnListMapper")
public interface CustomerReturnListMapper {

	/**
	 * 获取当天最大客户退货单号
	 * @return
	 */
//	@Query(value="SELECT MAX(customer_return_number) FROM t_customer_return_list WHERE TO_DAYS(customer_return_date) = TO_DAYS(NOW())",nativeQuery=true)
	public String getTodayMaxCustomerReturnNumber();

}
