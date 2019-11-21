package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.Supplier;
import com.xiaoduo.sms.mapper.SupplierMapper;
import com.xiaoduo.sms.service.SupplierService;
import com.xiaoduo.sms.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 供应商Service实现类
 */
@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierMapper supplierMapper;

	@Override
	public void save(Supplier supplier) {

//		supplierMapper.save(supplier);
	}

//	@Override
//	public List<Supplier> list(Supplier supplier, Integer page, Integer pageSize, Direction direction, String... properties) {
//		Pageable pageable=new PageRequest(page-1, pageSize, direction,properties);
////		Page<Supplier> pageSupplier=supplierMapper.findAll(new Specification<Supplier>() {
////
////			@Override
////			public Predicate toPredicate(Root<Supplier> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////				Predicate predicate=cb.conjunction();
////				if(supplier!=null){
////					if(StringUtil.isNotEmpty(supplier.getName())){
////						predicate.getExpressions().add(cb.like(root.get("name"), "%"+supplier.getName().trim()+"%"));
////					}
////				}
////				return predicate;
////			}
////		}, pageable);
////		return pageSupplier.getContent();
//
//		return null;
//	}

	@Override
	public Long getCount(Supplier supplier) {
//		Long count=supplierMapper.count(new Specification<Supplier>() {
//
//			@Override
//			public Predicate toPredicate(Root<Supplier> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				Predicate predicate=cb.conjunction();
//				if(supplier!=null){
//					if(StringUtil.isNotEmpty(supplier.getName())){
//						predicate.getExpressions().add(cb.like(root.get("name"), "%"+supplier.getName().trim()+"%"));
//					}
//				}
//				return predicate;
//			}
//		});
//		return count;

		return null;
	}

	@Override
	public void delete(Integer id) {

//		supplierMapper.delete(id);

	}

	@Override
	public Supplier findById(Integer id) {

//		return supplierMapper.findOne(id);

		return null;
	}

	@Override
	public List<Supplier> findByName(String name) {

		return supplierMapper.findByName(name);
	}


}
