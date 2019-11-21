package com.xiaoduo.sms.service;

import java.util.List;

import com.xiaoduo.sms.entity.Supplier;
import org.springframework.stereotype.Component;

/**
 * 供应商Service接口
 */
@Component("supplierService")
public interface SupplierService {

	/**
	 * 根据名称模糊查询供应商信息
	 * @param name
	 * @return
	 */
	 List<Supplier> findByName(String name);
	
	/**
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	 Supplier findById(Integer id);
	
	/**
	 * 修改或者修改供应商信息
	 * @param supplier
	 */
	 void save(Supplier supplier);
	
	/**
	 * 根据条件分页查询供应商信息
	 * @param supplier
	 * @param page
	 * @param pageSize
	 * @param direction
	 * @param properties
	 * @return
	 */
//	 List<Supplier> list(Supplier supplier, Integer page, Integer pageSize, Direction direction, String... properties);
	
	/**
	 * 获取总记录数
	 * @param supplier
	 * @return
	 */
	 Long getCount(Supplier supplier);
	
	/**
	 * 根据id删除供应商
	 * @param id
	 */
	 void delete(Integer id);
}
