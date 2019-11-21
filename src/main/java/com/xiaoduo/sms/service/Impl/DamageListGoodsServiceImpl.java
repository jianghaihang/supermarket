package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.DamageListGoods;
import com.xiaoduo.sms.mapper.DamageListGoodsMapper;
import com.xiaoduo.sms.service.DamageListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 报损单商品Service实现类
 */
@Service
public class DamageListGoodsServiceImpl implements DamageListGoodsService {

    @Autowired
    private DamageListGoodsMapper damageListGoodsMapper;

    @Override
    public List<DamageListGoods> listByDamageListId(Integer damageListId) {

        return damageListGoodsMapper.listByDamageListId(damageListId);
    }


}
