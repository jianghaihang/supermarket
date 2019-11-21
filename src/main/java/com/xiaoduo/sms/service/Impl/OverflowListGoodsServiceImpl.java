package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.OverflowListGoods;
import com.xiaoduo.sms.mapper.OverflowListGoodsMapper;
import com.xiaoduo.sms.service.OverflowListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 报溢单商品Service实现类
 */
@Service
public class OverflowListGoodsServiceImpl implements OverflowListGoodsService {

	@Autowired
	private OverflowListGoodsMapper overflowListGoodsMapper;

	@Override
	public List<OverflowListGoods> listByOverflowListId(Integer overflowListId) {

		return overflowListGoodsMapper.listByOverflowListId(overflowListId);
	}

	

}
