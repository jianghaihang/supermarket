package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.OverflowListGoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 报溢单商品Repository接口
 * @author Administrator
 *
 */
@Mapper
@Component("overflowListGoodsMapper")
public interface OverflowListGoodsMapper {

	/**
	 * 根据报溢单id查询所有报溢单商品
	 * @param overflowListId
	 * @return
	 */
//	@Query(value="select * from t_overflow_list_goods where overflow_list_id=?1",nativeQuery=true)
	public List<OverflowListGoods> listByOverflowListId(Integer overflowListId);
	
	/**
	 * 删除指定报溢单的所有商品
	 * @param overflowListId
	 */
//	@Query(value="delete from t_overflow_list_goods where overflow_list_id=?1",nativeQuery=true)
//	@Modifying
	public void deleteByOverflowListId(Integer overflowListId);
}
