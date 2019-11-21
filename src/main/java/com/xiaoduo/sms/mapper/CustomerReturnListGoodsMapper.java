package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.CustomerReturnListGoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 客户退货单商品Repository接口
 * @author Administrator
 *
 */
@Mapper
@Component("customerReturnListGoodsMapper")
public interface CustomerReturnListGoodsMapper{

	/**
	 * 根据客户退货单id查询所有客户退货单商品
	 * @param customerReturnListId
	 * @return
	 */
//	@Query(value="select * from t_customer_return_list_goods where customer_return_list_id=?1",nativeQuery=true)
	public List<CustomerReturnListGoods> listByCustomerReturnListId(Integer customerReturnListId);
	
	/**
	 * 删除指定客户退货单的所有商品
	 * @param customerReturnListId
	 */
//	@Query(value="delete from t_customer_return_list_goods where customer_return_list_id=?1",nativeQuery=true)
//	@Modifying
	public void deleteByCustomerReturnListId(Integer customerReturnListId);
	
	/**
	 * 统计某个商品的客户退货总量
	 * @param goodsId
	 * @return
	 */
//	@Query(value="SELECT SUM(num) AS total FROM t_customer_return_list_goods WHERE goods_id=?1",nativeQuery=true)
	public Integer getTotalByGoodsId(Integer goodsId);
}
