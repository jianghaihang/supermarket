package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.Goods;
import com.xiaoduo.sms.entity.SaleList;
import com.xiaoduo.sms.entity.SaleListGoods;
import com.xiaoduo.sms.mapper.GoodsMapper;
import com.xiaoduo.sms.mapper.GoodsTypeMapper;
import com.xiaoduo.sms.mapper.SaleListGoodsMapper;
import com.xiaoduo.sms.mapper.SaleListMapper;
import com.xiaoduo.sms.service.SaleListService;
import com.xiaoduo.sms.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 销售单Service实现类
 */
@Service
@Transactional
public class SaleListServiceImpl implements SaleListService {

    @Autowired
    private SaleListMapper saleListMapper;

    @Autowired
    private SaleListGoodsMapper saleListGoodsMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public String getTodayMaxSaleNumber() {
        return saleListMapper.getTodayMaxSaleNumber();
    }

    @Transactional
    public void save(SaleList saleList, List<SaleListGoods> saleListGoodsList) {
        // 保存每个销售单商品
//		for(SaleListGoods saleListGoods:saleListGoodsList){
//			saleListGoods.setType(goodsTypeMapper.findOne(saleListGoods.getTypeId())); // 设置类别
//			saleListGoods.setSaleList(saleList); // 设置采购单
//			saleListGoodsMapper.save(saleListGoods);
//			// 修改商品库存
//			Goods goods=goodsMapper.findOne(saleListGoods.getGoodsId());
//			goods.setInventoryQuantity(goods.getInventoryQuantity()-saleListGoods.getNum());
//			goods.setState(2);
//			goodsMapper.save(goods);
//		}
//		saleListMapper.save(saleList); // 保存销售单
    }

//    @Override
//    public List<SaleList> list(SaleList saleList, Direction direction,
//                               String... properties) {
////		return saleListMapper.findAll(new Specification<SaleList>(){
////
////			@Override
////			public Predicate toPredicate(Root<SaleList> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////				Predicate predicate=cb.conjunction();
////				if(saleList!=null){
////					if(saleList.getCustomer()!=null && saleList.getCustomer().getId()!=null){
////						predicate.getExpressions().add(cb.equal(root.get("customer").get("id"), saleList.getCustomer().getId()));
////					}
////					if(StringUtil.isNotEmpty(saleList.getSaleNumber())){
////						predicate.getExpressions().add(cb.like(root.get("saleNumber"), "%"+saleList.getSaleNumber().trim()+"%"));
////					}
////					if(saleList.getState()!=null){
////						predicate.getExpressions().add(cb.equal(root.get("state"), saleList.getState()));
////					}
////					if(saleList.getbSaleDate()!=null){
////						predicate.getExpressions().add(cb.greaterThanOrEqualTo(root.get("saleDate"), saleList.getbSaleDate()));
////					}
////					if(saleList.geteSaleDate()!=null){
////						predicate.getExpressions().add(cb.lessThanOrEqualTo(root.get("saleDate"), saleList.geteSaleDate()));
////					}
////				}
////				return predicate;
////			}
////		  },new Sort(direction, properties));
//
//        return null;
//    }

    @Override
    public void delete(Integer id) {

        saleListGoodsMapper.deleteBySaleListId(id);
//		saleListMapper.delete(id);
    }

    @Override
    public SaleList findById(Integer id) {

//        return saleListMapper.findOne(id);

        return null;
    }

    @Override
    public void update(SaleList saleList) {

//        saleListMapper.save(saleList);

    }

    @Override
    public List<Object> countSaleByDay(String begin, String end) {
        return saleListMapper.countSaleByDay(begin, end);
    }

    @Override
    public List<Object> countSaleByMonth(String begin, String end) {
        return saleListMapper.countSaleByMonth(begin, end);
    }


}
