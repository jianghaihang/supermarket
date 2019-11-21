package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.PurchaseListGoods;
import com.xiaoduo.sms.mapper.PurchaseListGoodsMapper;
import com.xiaoduo.sms.service.PurchaseListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 进货单商品Service实现类
 */
@Service
public class PurchaseListGoodsServiceImpl implements PurchaseListGoodsService {

    @Autowired
    private PurchaseListGoodsMapper purchaseListGoodsMapper;

    @Override
    public List<PurchaseListGoods> listByPurchaseListId(Integer purchaseListId) {
        return purchaseListGoodsMapper.listByPurchaseListId(purchaseListId);
    }

    @Override
    public List<PurchaseListGoods> list(PurchaseListGoods purchaseListGoods) {
//        return purchaseListGoodsMapper.findAll(new Specification<PurchaseListGoods>() {
//
//            @Override
//            public Predicate toPredicate(Root<PurchaseListGoods> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//                Predicate predicate = cb.conjunction();
//                if (purchaseListGoods != null) {
//                    if (purchaseListGoods.getType() != null && purchaseListGoods.getType().getId() != null && purchaseListGoods.getType().getId() != 1) {
//                        predicate.getExpressions().add(cb.equal(root.get("type").get("id"), purchaseListGoods.getType().getId()));
//                    }
//                    if (StringUtil.isNotEmpty(purchaseListGoods.getCodeOrName())) {
//                        predicate.getExpressions().add(cb.or(cb.like(root.get("code"), "%" + purchaseListGoods.getCodeOrName() + "%"), cb.like(root.get("name"), "%" + purchaseListGoods.getCodeOrName() + "%")));
//                    }
//                    if (purchaseListGoods.getPurchaseList() != null && StringUtil.isNotEmpty(purchaseListGoods.getPurchaseList().getPurchaseNumber())) {
//                        predicate.getExpressions().add(cb.like(root.get("purchaseList").get("purchaseNumber"), "%" + purchaseListGoods.getPurchaseList().getPurchaseNumber() + "%"));
//                    }
//                }
//                return predicate;
//            }
//        });

        return null;
    }


}
