package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.Supplier;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 供应商Repository接口
 */
@Mapper
@Component("supplierMapper")
public interface SupplierMapper {

    /**
     * 根据名称模糊查询供应商信息
     *
     * @param name
     * @return
     */
//	@Query(value="select * from t_supplier where name like ?1",nativeQuery=true)
    List<Supplier> findByName(String name);

}
