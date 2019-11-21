package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.Goods;
import com.xiaoduo.sms.mapper.GoodsMapper;
import com.xiaoduo.sms.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品Service实现类
 */
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper goodsMapper;
	
	@Override
	public Goods findById(Integer id) {

//		return GoodsMapper.findOne(id);

		return null;
	}

	@Override
	public void save(Goods goods) {

//		GoodsMapper.save(goods);

	}

//	@Override
//	public List<Goods> list(Goods goods, Integer page, Integer pageSize, Direction direction, String... properties) {
////		Pageable pageable=new PageRequest(page-1, pageSize, direction,properties);
////		Page<Goods> pageUser=GoodsMapper.findAll(new Specification<Goods>() {
////
////			@Override
////			public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////				Predicate predicate=cb.conjunction();
////				if(goods!=null){
////					if(StringUtil.isNotEmpty(goods.getName())){
////						predicate.getExpressions().add(cb.like(root.get("name"), "%"+goods.getName().trim()+"%"));
////					}
////					if(goods.getType()!=null && goods.getType().getId()!=null && goods.getType().getId()!=1){
////						predicate.getExpressions().add(cb.equal(root.get("type").get("id"), goods.getType().getId()));
////					}
////					if(StringUtil.isNotEmpty(goods.getCodeOrName())){
////						predicate.getExpressions().add(cb.or(cb.like(root.get("code"),"%"+goods.getCodeOrName()+"%"), cb.like(root.get("name"),"%"+goods.getCodeOrName()+"%")));
////					}
////				}
////				return predicate;
////			}
////		}, pageable);
////		return pageUser.getContent();
//
//		return null;
//	}

	@Override
	public Long getCount(Goods goods) {
//		Long count=GoodsMapper.count(new Specification<Goods>() {
//
//			@Override
//			public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				Predicate predicate=cb.conjunction();
//				if(goods!=null){
//					if(StringUtil.isNotEmpty(goods.getName())){
//						predicate.getExpressions().add(cb.like(root.get("name"), "%"+goods.getName().trim()+"%"));
//					}
//					if(goods.getType()!=null && goods.getType().getId()!=null && goods.getType().getId()!=1){
//						predicate.getExpressions().add(cb.equal(root.get("type").get("id"), goods.getType().getId()));
//					}
//					if(StringUtil.isNotEmpty(goods.getCodeOrName())){
//						predicate.getExpressions().add(cb.or(cb.like(root.get("code"),"%"+goods.getCodeOrName()+"%"), cb.like(root.get("name"),"%"+goods.getCodeOrName()+"%")));
//					}
//				}
//				return predicate;
//			}
//		});
//		return count;

		return null;
	}

	@Override
	public void delete(Integer id) {

//		GoodsMapper.delete(id);
	}

	@Override
	public String getMaxGoodsCode() {

//		return GoodsMapper.getMaxGoodsCode();

		return null;
	}

//	@Override
////	public List<Goods> listNoInventoryQuantityByCodeOrName(String codeOrName, Integer page, Integer pageSize,
////			Direction direction, String... properties) {
////		Pageable pageable=new PageRequest(page-1, pageSize, direction,properties);
//////		Page<Goods> pageUser=GoodsMapper.findAll(new Specification<Goods>() {
//////
//////			@Override
//////			public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//////				Predicate predicate=cb.conjunction();
//////				if(StringUtil.isNotEmpty(codeOrName)){
//////					predicate.getExpressions().add(cb.or(cb.like(root.get("code"),"%"+codeOrName+"%"), cb.like(root.get("name"),"%"+codeOrName+"%")));
//////				}
//////				predicate.getExpressions().add(cb.equal(root.get("inventoryQuantity"), 0)); // 库存是0
//////				return predicate;
//////			}
//////		}, pageable);
//////		return pageUser.getContent();
////
////		return null;
////	}

	@Override
	public Long getCountNoInventoryQuantityByCodeOrName(String codeOrName) {
//		Long count=GoodsMapper.count(new Specification<Goods>() {
////
////			@Override
////			public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////				Predicate predicate=cb.conjunction();
////				if(StringUtil.isNotEmpty(codeOrName)){
////					predicate.getExpressions().add(cb.or(cb.like(root.get("code"),"%"+codeOrName+"%"), cb.like(root.get("name"),"%"+codeOrName+"%")));
////				}
////				predicate.getExpressions().add(cb.equal(root.get("inventoryQuantity"), 0)); // 库存是0
////				return predicate;
////			}
////		});
////		return count;

		return null;
	}

//	@Override
//	public List<Goods> listHasInventoryQuantity(Integer page, Integer pageSize, Direction direction,
//			String... properties) {
//		Pageable pageable=new PageRequest(page-1, pageSize, direction,properties);
////		Page<Goods> pageUser=GoodsMapper.findAll(new Specification<Goods>() {
////
////			@Override
////			public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////				Predicate predicate=cb.conjunction();
////				predicate.getExpressions().add(cb.greaterThan(root.get("inventoryQuantity"), 0)); // 库存不是0
////				return predicate;
////			}
////		}, pageable);
////		return pageUser.getContent();
//
//		return null;
//	}

	@Override
	public Long getCountHasInventoryQuantity() {
//		Long count=GoodsMapper.count(new Specification<Goods>() {
//
//			@Override
//			public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				Predicate predicate=cb.conjunction();
//				predicate.getExpressions().add(cb.greaterThan(root.get("inventoryQuantity"), 0)); // 库存不是0
//				return predicate;
//			}
//		});
//		return count;

		return null;
	}

	@Override
	public List<Goods> listAlarm() {

//		return GoodsMapper.listAlarm();

		return null;
	}



}
