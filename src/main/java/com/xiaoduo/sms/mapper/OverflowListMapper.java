package com.xiaoduo.sms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 报溢单Repository接口
 * @author Administrator
 *
 */
@Mapper
@Component("overflowListMapper")
public interface OverflowListMapper{

	/**
	 * 获取当天最大报溢单号
	 * @return
	 */
//	@Query(value="SELECT MAX(overflow_number) FROM t_overflow_list WHERE TO_DAYS(overflow_date) = TO_DAYS(NOW())",nativeQuery=true)
	public String getTodayMaxOverflowNumber();
}
