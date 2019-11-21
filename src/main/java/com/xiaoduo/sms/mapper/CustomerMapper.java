package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 客户Repository接口
 *
 */
@Mapper
@Component("customerMapper")
public interface CustomerMapper{

	/**
	 * 根据名称模糊查询客户信息
	 * @param name
	 * @return
	 */
//	@Query(value="select * from t_customer where name like ?1",nativeQuery=true)
	public List<Customer> findByName(String name);
}
