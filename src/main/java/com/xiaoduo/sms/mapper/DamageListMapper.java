package com.xiaoduo.sms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 报损单Repository接口
 * @author Administrator
 *
 */
@Mapper
@Component("damageListMapper")
public interface DamageListMapper{

	/**
	 * 获取当天最大报损单号
	 * @return
	 */
//	@Query(value="SELECT MAX(damage_number) FROM t_damage_list WHERE TO_DAYS(damage_date) = TO_DAYS(NOW())",nativeQuery=true)
	public String getTodayMaxDamageNumber();
}
