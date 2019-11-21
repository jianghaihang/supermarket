package com.xiaoduo.sms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 退货单Repository接口
 * @author Administrator
 *
 */
@Mapper
@Component("returnListMapper")
public interface ReturnListMapper {

	/**
	 * 获取当天最大退货单号
	 * @return
	 */
//	@Query(value="SELECT MAX(return_number) FROM t_return_list WHERE TO_DAYS(return_date) = TO_DAYS(NOW())",nativeQuery=true)
	String getTodayMaxReturnNumber();
}
