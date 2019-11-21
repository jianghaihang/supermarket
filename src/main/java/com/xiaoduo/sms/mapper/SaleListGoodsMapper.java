package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.SaleListGoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 销售单商品Repository接口
 * @author Administrator
 *
 */
@Mapper
@Component("saleListGoodsMapper")
public interface SaleListGoodsMapper {

	/**
	 * 根据销售单id查询所有销售单商品
	 * @param saleListId
	 * @return
	 */
//	@Query(value="select * from t_sale_list_goods where sale_list_id=?1",nativeQuery=true)
	 List<SaleListGoods> listBySaleListId(Integer saleListId);
	
	/**
	 * 删除指定销售单的所有商品
	 * @param saleListId
	 */
//	@Query(value="delete from t_sale_list_goods where sale_list_id=?1",nativeQuery=true)
//	@Modifying
	void deleteBySaleListId(Integer saleListId);
	
	/**
	 * 统计某个商品的销售总量
	 * @param goodsId
	 * @return
	 */
//	@Query(value="SELECT SUM(num) AS total FROM t_sale_list_goods WHERE goods_id=?1",nativeQuery=true)
	Integer getTotalByGoodsId(Integer goodsId);
	
}
