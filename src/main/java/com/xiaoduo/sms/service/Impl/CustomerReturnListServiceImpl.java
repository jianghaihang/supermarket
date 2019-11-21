package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.CustomerReturnList;
import com.xiaoduo.sms.entity.CustomerReturnListGoods;
import com.xiaoduo.sms.mapper.CustomerReturnListGoodsMapper;
import com.xiaoduo.sms.mapper.CustomerReturnListMapper;
import com.xiaoduo.sms.mapper.GoodsMapper;
import com.xiaoduo.sms.mapper.GoodsTypeMapper;
import com.xiaoduo.sms.service.CustomerReturnListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 销售单Service实现类
 */
@SuppressWarnings("ALL")
@Service
@Transactional
public class CustomerReturnListServiceImpl implements CustomerReturnListService {

    @Autowired
    private CustomerReturnListMapper customerReturnListMapper;

    @Autowired
    private CustomerReturnListGoodsMapper customerReturnListGoodsMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public String getTodayMaxCustomerReturnNumber() {
        return customerReturnListMapper.getTodayMaxCustomerReturnNumber();
    }

    @Transactional
    public void save(CustomerReturnList customerReturnList, List<CustomerReturnListGoods> customerReturnListGoodsList) {
        // 保存每个销售单商品
//        for (CustomerReturnListGoods customerReturnListGoods : customerReturnListGoodsList) {
//
//            customerReturnListGoods.setType(goodsTypeMapper.findOne(customerReturnListGoods.getTypeId())); // 设置类别
//
//            customerReturnListGoods.setCustomerReturnList(customerReturnList); // 设置采购单
//
//            customerReturnListGoodsMapper.save(customerReturnListGoods);
//
//            // 修改商品库存
//            Goods goods = goodsMapper.findOne(customerReturnListGoods.getGoodsId());
//
//            goods.setInventoryQuantity(goods.getInventoryQuantity() + customerReturnListGoods.getNum());
//
//            goods.setState(2);
//
//            goodsMapper.save(goods);
//        }
//        customerReturnListMapper.save(customerReturnList); // 保存销售单
    }

//    @Override
//    public List<CustomerReturnList> list(CustomerReturnList customerReturnList, Direction direction,
//                                         String... properties) {
////        return customerReturnListMapper.findAll(new Specification<CustomerReturnList>() {
////
////            @Override
////            public Predicate toPredicate(Root<CustomerReturnList> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////                Predicate predicate = cb.conjunction();
////                if (customerReturnList != null) {
////                    if (customerReturnList.getCustomer() != null && customerReturnList.getCustomer().getId() != null) {
////                        predicate.getExpressions().add(cb.equal(root.get("customer").get("id"), customerReturnList.getCustomer().getId()));
////                    }
////                    if (StringUtil.isNotEmpty(customerReturnList.getCustomerReturnNumber())) {
////                        predicate.getExpressions().add(cb.like(root.get("customerReturnNumber"), "%" + customerReturnList.getCustomerReturnNumber().trim() + "%"));
////                    }
////                    if (customerReturnList.getState() != null) {
////                        predicate.getExpressions().add(cb.equal(root.get("state"), customerReturnList.getState()));
////                    }
////                    if (customerReturnList.getbCustomerReturnDate() != null) {
////                        predicate.getExpressions().add(cb.greaterThanOrEqualTo(root.get("customerReturnDate"), customerReturnList.getbCustomerReturnDate()));
////                    }
////                    if (customerReturnList.geteCustomerReturnDate() != null) {
////                        predicate.getExpressions().add(cb.lessThanOrEqualTo(root.get("customerReturnDate"), customerReturnList.geteCustomerReturnDate()));
////                    }
////                }
////                return predicate;
////            }
////        }, new Sort(direction, properties));
//
//        return null;
//    }

    @Override
    public void delete(Integer id) {

//        customerReturnListGoodsRepository.deleteByCustomerReturnListId(id);
//
//        customerReturnListRepository.delete(id);
    }

    @Override
    public CustomerReturnList findById(Integer id) {


//        return customerReturnListRepository.findOne(id);

        return null;
    }

    @Override
    public void update(CustomerReturnList customerReturnList) {

//        customerReturnListRepository.save(customerReturnList);
    }


}
