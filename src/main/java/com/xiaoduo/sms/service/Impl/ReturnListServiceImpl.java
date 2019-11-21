package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.Goods;
import com.xiaoduo.sms.entity.ReturnList;
import com.xiaoduo.sms.entity.ReturnListGoods;
import com.xiaoduo.sms.mapper.GoodsMapper;
import com.xiaoduo.sms.mapper.GoodsTypeMapper;
import com.xiaoduo.sms.mapper.ReturnListGoodsMapper;
import com.xiaoduo.sms.mapper.ReturnListMapper;
import com.xiaoduo.sms.service.ReturnListService;
import com.xiaoduo.sms.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 退货单Service实现类
 */
@Service
@Transactional
public class ReturnListServiceImpl implements ReturnListService {

    @Autowired
    private ReturnListMapper returnListMapper;

    @Autowired
    private ReturnListGoodsMapper returnListGoodsMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public String getTodayMaxReturnNumber() {
        return returnListMapper.getTodayMaxReturnNumber();
    }

    @Transactional
    public void save(ReturnList returnList, List<ReturnListGoods> returnListGoodsList) {
        // 保存每个退货单商品
//		for(ReturnListGoods returnListGoods:returnListGoodsList){
//
//			returnListGoods.setType(goodsTypeMapper.findOne(returnListGoods.getTypeId())); // 设置类别
//
//			returnListGoods.setReturnList(returnList); // 设置退货单
//
//			returnListGoodsMapper.save(returnListGoods);
//
//			// 修改商品库存
//			Goods goods=goodsMapper.findOne(returnListGoods.getGoodsId());
//
//			goods.setInventoryQuantity(goods.getInventoryQuantity()-returnListGoods.getNum());
//			goods.setState(2);
//
//			goodsMapper.save(goods);
//		}
//		returnListMapper.save(returnList); // 保存退货单

    }

    @Override
    public ReturnList findById(Integer id) {

//		return returnListMapper.findOne(id);

        return null;

    }

//    @Override
//    public List<ReturnList> list(ReturnList returnList, Direction direction, String... properties) {
//
////		return returnListMapper.findAll(new Specification<ReturnList>(){
////
////			@Override
////			public Predicate toPredicate(Root<ReturnList> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////				Predicate predicate=cb.conjunction();
////				if(returnList!=null){
////					if(returnList.getSupplier()!=null && returnList.getSupplier().getId()!=null){
////						predicate.getExpressions().add(cb.equal(root.get("supplier").get("id"), returnList.getSupplier().getId()));
////					}
////					if(StringUtil.isNotEmpty(returnList.getReturnNumber())){
////						predicate.getExpressions().add(cb.like(root.get("returnNumber"), "%"+returnList.getReturnNumber().trim()+"%"));
////					}
////					if(returnList.getState()!=null){
////						predicate.getExpressions().add(cb.equal(root.get("state"), returnList.getState()));
////					}
////					if(returnList.getbReturnDate()!=null){
////						predicate.getExpressions().add(cb.greaterThanOrEqualTo(root.get("returnDate"), returnList.getbReturnDate()));
////					}
////					if(returnList.geteReturnDate()!=null){
////						predicate.getExpressions().add(cb.lessThanOrEqualTo(root.get("returnDate"), returnList.geteReturnDate()));
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

        returnListGoodsMapper.deleteByReturnListId(id);
//        returnListMapper.delete(id);
    }

    @Override
    public void update(ReturnList returnList) {

//        returnListMapper.save(returnList);
    }

}
