package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.OverflowList;
import com.xiaoduo.sms.entity.OverflowListGoods;
import com.xiaoduo.sms.mapper.GoodsMapper;
import com.xiaoduo.sms.mapper.GoodsTypeMapper;
import com.xiaoduo.sms.mapper.OverflowListGoodsMapper;
import com.xiaoduo.sms.mapper.OverflowListMapper;
import com.xiaoduo.sms.service.OverflowListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 报溢单Service实现类
 */
@Service
@Transactional
public class OverflowListServiceImpl implements OverflowListService {

	@Autowired
	private OverflowListMapper overflowListMapper;
	
	@Autowired
	private OverflowListGoodsMapper overflowListGoodsMapper;
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Autowired
	private GoodsTypeMapper goodsTypeMapper;
	
	@Override
	public String getTodayMaxOverflowNumber() {
		return overflowListMapper.getTodayMaxOverflowNumber();
	}

	@Transactional
	public void save(OverflowList overflowList, List<OverflowListGoods> overflowListGoodsList) {
		// 保存每个报溢单商品
//		for(OverflowListGoods overflowListGoods:overflowListGoodsList){
//			overflowListGoods.setType(overflowListMapper.findOne(overflowListGoods.getTypeId())); // 设置类别
//			overflowListGoods.setOverflowList(overflowList); // 设置采购单
//			overflowListGoodsMapper.save(overflowListGoods);
//			// 修改商品库存
//			Goods goods=goodsMapper.findOne(overflowListGoods.getGoodsId());
//			goods.setInventoryQuantity(goods.getInventoryQuantity()+overflowListGoods.getNum());
//			goods.setState(2);
//			goodsMapper.save(goods);
//		}
//		overflowListMapper.save(overflowList); // 保存报溢单
	}

//	@Override
//	public List<OverflowList> list(OverflowList overflowList, Direction direction,
//			String... properties) {
////		return overflowListMapper.findAll(new Specification<OverflowList>(){
//////
//////			@Override
//////			public Predicate toPredicate(Root<OverflowList> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//////				Predicate predicate=cb.conjunction();
//////				if(overflowList!=null){
//////					if(overflowList.getbOverflowDate()!=null){
//////						predicate.getExpressions().add(cb.greaterThanOrEqualTo(root.get("overflowDate"), overflowList.getbOverflowDate()));
//////					}
//////					if(overflowList.geteOverflowDate()!=null){
//////						predicate.getExpressions().add(cb.lessThanOrEqualTo(root.get("overflowDate"), overflowList.geteOverflowDate()));
//////					}
//////				}
//////				return predicate;
//////			}
//////		  },new Sort(direction, properties));
//
//		return null;
//	}

	@Override
	public void delete(Integer id) {
		overflowListGoodsMapper.deleteByOverflowListId(id);
//		overflowListMapper.delete(id);
	}

	@Override
	public OverflowList findById(Integer id) {

//		return overflowListMapper.findOne(id);

		return null;
	}



}
