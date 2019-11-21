package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.GoodsUnit;
import com.xiaoduo.sms.mapper.GoodsUnitMapper;
import com.xiaoduo.sms.service.GoodsUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品单位Service实现类
 *
 */
@Service
public class GoodsUnitServiceImpl implements GoodsUnitService {

	@Autowired
	private GoodsUnitMapper goodsUnitMapper;
	
	@Override
	public List<GoodsUnit> listAll() {

//		return GoodsUnitMapper.findAll();

		return null;
	}

	@Override
	public void save(GoodsUnit goodsUnit) {

//		GoodsUnitMapper.save(goodsUnit);
	}

	@Override
	public void delete(Integer id) {

//		GoodsUnitMapper.delete(id);
	}

	@Override
	public GoodsUnit findById(Integer id) {

//		return GoodsUnitMapper.findOne(id);

		return null;
	}

}
