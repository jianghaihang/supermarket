package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.GoodsType;
import com.xiaoduo.sms.mapper.GoodsTypeMapper;
import com.xiaoduo.sms.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 商品类别Service实现类
 */
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

	@Autowired
	private GoodsTypeMapper goodsTypeMapper;
	
	@Override
	public void save(GoodsType goodsType) {

//		GoodsTypeMapper.save(goodsType);
	}

	@Override
	public void delete(Integer id) {

//		GoodsTypeMapper.delete(id);
	}

	@Override
	public List<GoodsType> findByParentId(int parentId) {

//		return GoodsTypeMapper.findByParentId(parentId);

		return null;
	}

	@Override
	public GoodsType findById(Integer id) {

//		return GoodsTypeMapper.findOne(id);

		return null;
	}

}
