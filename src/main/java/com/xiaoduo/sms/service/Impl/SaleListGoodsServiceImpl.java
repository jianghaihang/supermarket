package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.SaleListGoods;
import com.xiaoduo.sms.mapper.SaleListGoodsMapper;
import com.xiaoduo.sms.service.SaleListGoodsService;
import com.xiaoduo.sms.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 销售单商品Service实现类
 */
@Service
public class SaleListGoodsServiceImpl implements SaleListGoodsService {

	@Autowired
	private SaleListGoodsMapper saleListGoodsMapper;

	@Override
	public List<SaleListGoods> listBySaleListId(Integer saleListId) {
		return saleListGoodsMapper.listBySaleListId(saleListId);
	}

	@Override
	public Integer getTotalByGoodsId(Integer goodsId) {
		return saleListGoodsMapper.getTotalByGoodsId(goodsId)==null?0:saleListGoodsMapper.getTotalByGoodsId(goodsId);
	}

	@Override
	public List<SaleListGoods> list(SaleListGoods saleListGoods) {
//		return saleListGoodsMapper.findAll(new Specification<SaleListGoods>() {
//
//					@Override
//					public Predicate toPredicate(Root<SaleListGoods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//						Predicate predicate=cb.conjunction();
//						if(saleListGoods!=null){
//							if(saleListGoods.getType()!=null && saleListGoods.getType().getId()!=null && saleListGoods.getType().getId()!=1){
//								predicate.getExpressions().add(cb.equal(root.get("type").get("id"), saleListGoods.getType().getId()));
//							}
//							if(StringUtil.isNotEmpty(saleListGoods.getCodeOrName())){
//								predicate.getExpressions().add(cb.or(cb.like(root.get("code"),"%"+saleListGoods.getCodeOrName()+"%"), cb.like(root.get("name"),"%"+saleListGoods.getCodeOrName()+"%")));
//							}
//							if(saleListGoods.getSaleList()!=null && StringUtil.isNotEmpty(saleListGoods.getSaleList().getSaleNumber())){
//								predicate.getExpressions().add(cb.like(root.get("saleList").get("saleNumber"), "%"+saleListGoods.getSaleList().getSaleNumber()+"%"));
//							}
//						}
//						return predicate;
//					}
//				});

		return null;
	}

	

}
