package com.xiaoduo.sms.service.Impl;

import java.util.List;

import com.xiaoduo.sms.entity.CustomerReturnListGoods;
import com.xiaoduo.sms.mapper.CustomerReturnListMapper;
import com.xiaoduo.sms.service.CustomerReturnListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 客户退货单商品Service实现类
 *
 * @author
 */
@Service
public class CustomerReturnListGoodsServiceImpl implements CustomerReturnListGoodsService {

    @Autowired
    private CustomerReturnListMapper customerReturnListMapper;

    @Override
    public List<CustomerReturnListGoods> listByCustomerReturnListId(Integer customerReturnListId) {

        // TODO
//		return customerReturnListMapper.listByCustomerReturnListId(customerReturnListId);

        return null;
    }

    @Override
    public Integer getTotalByGoodsId(Integer goodsId) {

//		return customerReturnListMapper.getTotalByGoodsId(goodsId)==null?0:customerReturnListMapper.getTotalByGoodsId(goodsId);

        return null;
    }

    @Override
    public List<CustomerReturnListGoods> list(CustomerReturnListGoods customerReturnListGoods) {

        return  null;

//        return customerReturnListMapper.findAll(new Specification<CustomerReturnListGoods>() {
//
//            @Override
//            public Predicate toPredicate(Root<CustomerReturnListGoods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//
//                Predicate predicate = cb.conjunction();
//
//                if (customerReturnListGoods != null) {
//
//                    if (customerReturnListGoods.getType() != null && customerReturnListGoods.getType().getId() != null && customerReturnListGoods.getType().getId() != 1) {
//
//                        predicate.getExpressions().add(cb.equal(root.get("type").get("id"), customerReturnListGoods.getType().getId()));
//                    }
//
//                    if (StringUtil.isNotEmpty(customerReturnListGoods.getCodeOrName())) {
//
//                        predicate.getExpressions().add(cb.or(cb.like(root.get("code"), "%" + customerReturnListGoods.getCodeOrName() + "%"), cb.like(root.get("name"), "%" + customerReturnListGoods.getCodeOrName() + "%")));
//                    }
//
//                    if (customerReturnListGoods.getCustomerReturnList() != null && StringUtil.isNotEmpty(customerReturnListGoods.getCustomerReturnList().getCustomerReturnNumber())) {
//
//                        predicate.getExpressions().add(cb.like(root.get("customerReturnList").get("customerReturnNumber"), "%" + customerReturnListGoods.getCustomerReturnList().getCustomerReturnNumber() + "%"));
//                    }
//                }
//                return predicate;
//            }
//        });
    }


}
