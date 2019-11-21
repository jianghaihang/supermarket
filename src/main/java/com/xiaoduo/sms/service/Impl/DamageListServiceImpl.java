package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.DamageList;
import com.xiaoduo.sms.entity.DamageListGoods;
import com.xiaoduo.sms.entity.Goods;
import com.xiaoduo.sms.mapper.DamageListGoodsMapper;
import com.xiaoduo.sms.mapper.DamageListMapper;
import com.xiaoduo.sms.mapper.GoodsMapper;
import com.xiaoduo.sms.mapper.GoodsTypeMapper;
import com.xiaoduo.sms.service.DamageListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 报损单Service实现类
 */
@Service
@Transactional
public class DamageListServiceImpl implements DamageListService {

    @Autowired
    private DamageListMapper damageListMapper;

    @Autowired
    private DamageListGoodsMapper damageListGoodsMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public String getTodayMaxDamageNumber() {
        return damageListMapper.getTodayMaxDamageNumber();
    }

    @Transactional
    public void save(DamageList damageList, List<DamageListGoods> damageListGoodsList) {
        // 保存每个报损单商品
//        for (DamageListGoods damageListGoods : damageListGoodsList) {
//            damageListGoods.setType(goodsTypeMapper.findOne(damageListGoods.getTypeId())); // 设置类别
//            damageListGoods.setDamageList(damageList); // 设置采购单
//            damageListGoodsRepository.save(damageListGoods);
//            // 修改商品库存
//            Goods goods = goodsRepository.findOne(damageListGoods.getGoodsId());
//            goods.setInventoryQuantity(goods.getInventoryQuantity() - damageListGoods.getNum());
//            goods.setState(2);
//            goodsRepository.save(goods);
//        }
//        damageListMapper.save(damageList); // 保存报损单
    }

//    @Override
//    public List<DamageList> list(DamageList damageList, Direction direction,
//                                 String... properties) {
////        return damageListRepository.findAll(new Specification<DamageList>() {
////
////            @Override
////            public Predicate toPredicate(Root<DamageList> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////                Predicate predicate = cb.conjunction();
////                if (damageList != null) {
////                    if (damageList.getbDamageDate() != null) {
////                        predicate.getExpressions().add(cb.greaterThanOrEqualTo(root.get("damageDate"), damageList.getbDamageDate()));
////                    }
////                    if (damageList.geteDamageDate() != null) {
////                        predicate.getExpressions().add(cb.lessThanOrEqualTo(root.get("damageDate"), damageList.geteDamageDate()));
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
//        damageListGoodsRepository.deleteByDamageListId(id);
//        damageListRepository.delete(id);
    }

    @Override
    public DamageList findById(Integer id) {

//        return damageListRepository.findOne(id);
        return null;
    }


}
