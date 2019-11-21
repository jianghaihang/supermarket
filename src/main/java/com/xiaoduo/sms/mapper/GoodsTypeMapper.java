package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.GoodsType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 商品类别Repository接口
 * @author java1234 小锋 老师
 *
 */
@Mapper
@Component("goodsTypeMapper")
public interface GoodsTypeMapper {

	/**
	 * 根据父节点查找商品类别
	 * @param parentId
	 * @return
	 */
//	@Query(value="select * from t_goodstype where p_id=?1",nativeQuery=true)
	public List<GoodsType> findByParentId(int parentId);
}
