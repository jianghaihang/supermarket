package com.xiaoduo.sms.mapper;


import com.xiaoduo.sms.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 商品Repository接口
 *
 */
@Mapper
@Component("goodsMapper")
public interface GoodsMapper {

	/**
	 * 获取最大的商品编号
	 * @return
	 */
//	@Query(value="select max(code) from t_goods",nativeQuery=true)
	String getMaxGoodsCode();
	
	/**
	 * 查询库存报警商品 库存小于库存下限的商品
	 * @return
	 */
//	@Query(value="SELECT * FROM t_goods WHERE inventory_quantity<min_num",nativeQuery=true)
	List<Goods> listAlarm();
	
}
