package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.ReturnListGoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 退货单商品Repository接口
 * @author Administrator
 *
 */
@Mapper
@Component("returnListGoodsMapper")
public interface ReturnListGoodsMapper {

	/**
	 * 根据退货单id查询所有退货单商品
	 * @param returnListId
	 * @return
	 */
//	@Query(value="select * from t_return_list_goods where return_list_id=?1",nativeQuery=true)
	List<ReturnListGoods> listByReturnListId(Integer returnListId);
	
	/**
	 * 删除指定退货单的所有商品
	 * @param returnListId
	 */
//	@Query(value="delete from t_return_list_goods where return_list_id=?1",nativeQuery=true)
//	@Modifying
	void deleteByReturnListId(Integer returnListId);
}