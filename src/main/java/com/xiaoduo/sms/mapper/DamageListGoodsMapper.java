package com.xiaoduo.sms.mapper;

import com.xiaoduo.sms.entity.DamageListGoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 报损单商品Repository接口
 * @author Administrator
 *
 */
@Mapper
@Component("damageListGoodsMapper")
public interface DamageListGoodsMapper {

	/**
	 * 根据报损单id查询所有报损单商品
	 * @param damageListId
	 * @return
	 */
//	@Query(value="select * from t_damage_list_goods where damage_list_id=?1",nativeQuery=true)
	public List<DamageListGoods> listByDamageListId(Integer damageListId);
	
	/**
	 * 删除指定报损单的所有商品
	 * @param damageListId
	 */
//	@Query(value="delete from t_damage_list_goods where damage_list_id=?1",nativeQuery=true)
//	@Modifying
	public void deleteByDamageListId(Integer damageListId);
}
