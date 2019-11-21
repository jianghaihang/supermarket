package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.PurchaseListGoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 进货单商品Repository接口
 * @author Administrator
 *
 */
@Mapper
@Component("purchaseListGoodsMapper")
public interface PurchaseListGoodsMapper {

	/**
	 * 根据进货单id查询所有进货单商品
	 * @param purchaseListId
	 * @return
	 */
//	@Query(value="select * from t_purchase_list_goods where purchase_list_id=?1",nativeQuery=true)
	public List<PurchaseListGoods> listByPurchaseListId(Integer purchaseListId);
	
	/**
	 * 删除指定进货单的所有商品
	 * @param purchaseListId
	 */
//	@Query(value="delete from t_purchase_list_goods where purchase_list_id=?1",nativeQuery=true)
//	@Modifying
	public void deleteByPurchaseListId(Integer purchaseListId);
}
