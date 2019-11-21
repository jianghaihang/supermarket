package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.Goods;
import com.xiaoduo.sms.entity.PurchaseList;
import com.xiaoduo.sms.entity.PurchaseListGoods;
import com.xiaoduo.sms.mapper.GoodsMapper;
import com.xiaoduo.sms.mapper.GoodsTypeMapper;
import com.xiaoduo.sms.mapper.PurchaseListGoodsMapper;
import com.xiaoduo.sms.mapper.PurchaseListMapper;
import com.xiaoduo.sms.service.PurchaseListService;
import com.xiaoduo.sms.util.MathUtil;
import com.xiaoduo.sms.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 进货单Service实现类
 */
@Service
@Transactional
public class PurchaseListServiceImpl implements PurchaseListService {

	@Autowired
	private PurchaseListMapper purchaseListMapper;
	
	@Autowired
	private PurchaseListGoodsMapper purchaseListGoodsMapper;
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Autowired
	private GoodsTypeMapper goodsTypeMapper;
	
	@Override
	public String getTodayMaxPurchaseNumber() {
		return purchaseListMapper.getTodayMaxPurchaseNumber();
	}

	@Transactional
	public void save(PurchaseList purchaseList, List<PurchaseListGoods> purchaseListGoodsList) {
		// 保存每个进货单商品
//		for(PurchaseListGoods purchaseListGoods:purchaseListGoodsList){
//			purchaseListGoods.setType(goodsTypeMapper.findOne(purchaseListGoods.getTypeId())); // 设置类别
//			purchaseListGoods.setPurchaseList(purchaseList); // 设置采购单
//			purchaseListGoodsMapper.save(purchaseListGoods);
//			// 修改商品库存 和 成本均价 以及上次进价
//			Goods goods=goodsMapper.findOne(purchaseListGoods.getGoodsId());
//			// 计算成本均价
//			float avePurchasingPrice=(goods.getPurchasingPrice()*goods.getInventoryQuantity()+purchaseListGoods.getPrice()*purchaseListGoods.getNum())/(goods.getInventoryQuantity()+purchaseListGoods.getNum());
//			goods.setPurchasingPrice(MathUtil.format2Bit(avePurchasingPrice));
//			goods.setInventoryQuantity(goods.getInventoryQuantity()+purchaseListGoods.getNum());
//			goods.setLastPurchasingPrice(purchaseListGoods.getPrice());
//			goods.setState(2);
//			goodsMapper.save(goods);
//		}
//		purchaseListMapper.save(purchaseList); // 保存进货单
	}

//	@Override
//	public List<PurchaseList> list(PurchaseList purchaseList, Direction direction,
//			String... properties) {
////		return purchaseListMapper.findAll(new Specification<PurchaseList>(){
////
////			@Override
////			public Predicate toPredicate(Root<PurchaseList> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////				Predicate predicate=cb.conjunction();
////				if(purchaseList!=null){
////					if(purchaseList.getSupplier()!=null && purchaseList.getSupplier().getId()!=null){
////						predicate.getExpressions().add(cb.equal(root.get("supplier").get("id"), purchaseList.getSupplier().getId()));
////					}
////					if(StringUtil.isNotEmpty(purchaseList.getPurchaseNumber())){
////						predicate.getExpressions().add(cb.like(root.get("purchaseNumber"), "%"+purchaseList.getPurchaseNumber().trim()+"%"));
////					}
////					if(purchaseList.getState()!=null){
////						predicate.getExpressions().add(cb.equal(root.get("state"), purchaseList.getState()));
////					}
////					if(purchaseList.getbPurchaseDate()!=null){
////						predicate.getExpressions().add(cb.greaterThanOrEqualTo(root.get("purchaseDate"), purchaseList.getbPurchaseDate()));
////					}
////					if(purchaseList.getePurchaseDate()!=null){
////						predicate.getExpressions().add(cb.lessThanOrEqualTo(root.get("purchaseDate"), purchaseList.getePurchaseDate()));
////					}
////				}
////				return predicate;
////			}
////		  },new Sort(direction, properties));
//
//		return null;
//	}

	@Override
	public void delete(Integer id) {

		purchaseListGoodsMapper.deleteByPurchaseListId(id);
//		purchaseListMapper.delete(id);
	}

	@Override
	public PurchaseList findById(Integer id) {

//		return purchaseListMapper.findOne(id);

		return null;
	}

	@Override
	public void update(PurchaseList purchaseList) {

//		purchaseListMapper.save(purchaseList);

	}



}
