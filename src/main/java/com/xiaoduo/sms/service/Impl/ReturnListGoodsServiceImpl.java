package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.ReturnListGoods;
import com.xiaoduo.sms.mapper.ReturnListGoodsMapper;
import com.xiaoduo.sms.service.ReturnListGoodsService;
import com.xiaoduo.sms.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 退货单商品Service实现类
 */
@Service
public class ReturnListGoodsServiceImpl implements ReturnListGoodsService {

	@Autowired
	private ReturnListGoodsMapper returnListGoodsMapper;

	@Override
	public List<ReturnListGoods> listByReturnListId(Integer returnListId) {
		return returnListGoodsMapper.listByReturnListId(returnListId);
	}

	@Override
	public List<ReturnListGoods> list(ReturnListGoods returnListGoods) {
//		return returnListGoodsMapper.findAll(new Specification<ReturnListGoods>() {
//
//			@Override
//			public Predicate toPredicate(Root<ReturnListGoods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				Predicate predicate=cb.conjunction();
//				if(returnListGoods!=null){
//					if(returnListGoods.getType()!=null && returnListGoods.getType().getId()!=null && returnListGoods.getType().getId()!=1){
//						predicate.getExpressions().add(cb.equal(root.get("type").get("id"), returnListGoods.getType().getId()));
//					}
//					if(StringUtil.isNotEmpty(returnListGoods.getCodeOrName())){
//						predicate.getExpressions().add(cb.or(cb.like(root.get("code"),"%"+returnListGoods.getCodeOrName()+"%"), cb.like(root.get("name"),"%"+returnListGoods.getCodeOrName()+"%")));
//					}
//					if(returnListGoods.getReturnList()!=null && StringUtil.isNotEmpty(returnListGoods.getReturnList().getReturnNumber())){
//						predicate.getExpressions().add(cb.like(root.get("returnList").get("returnNumber"), "%"+returnListGoods.getReturnList().getReturnNumber()+"%"));
//					}
//				}
//				return predicate;
//			}
//		});

		return null;
	}
	
}
