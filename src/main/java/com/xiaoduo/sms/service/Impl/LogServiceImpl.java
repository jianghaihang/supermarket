package com.xiaoduo.sms.service.Impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.Log;
import com.xiaoduo.sms.mapper.LogMapper;
import com.xiaoduo.sms.mapper.UserMapper;
import com.xiaoduo.sms.service.LogService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 系统日志Service实现类
 *
 */
@Service
public class LogServiceImpl implements LogService {

	@Autowired
	private LogMapper logMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void save(Log log) {
		log.setTime(new Date()); // 设置操作日期
		log.setUser(userMapper.findByUserName((String) SecurityUtils.getSubject().getPrincipal())); // 设置用户名
//		logMapper.save(log);
	}

//	@Override
//	public List<Log> list(Log log, Integer page, Integer pageSize, Direction direction, String... properties) {
//		Pageable pageable=new PageRequest(page-1, pageSize, direction,properties);
////		Page<Log> pageLog=logMapper.findAll(new Specification<Log>(){
////
////			@Override
////			public Predicate toPredicate(Root<Log> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////				Predicate predicate=cb.conjunction();
////				if(log!=null){
////					if(log.getUser()!=null && StringUtil.isNotEmpty(log.getUser().getTrueName())){
////						predicate.getExpressions().add(cb.like(root.get("user").get("trueName"), "%"+log.getUser().getTrueName()+"%"));
////					}
////					if(StringUtil.isNotEmpty(log.getType())){
////						predicate.getExpressions().add(cb.equal(root.get("type"), log.getType()));
////					}
////					if(log.getBtime()!=null){
////						predicate.getExpressions().add(cb.greaterThanOrEqualTo(root.get("time"), log.getBtime()));
////					}
////					if(log.getEtime()!=null){
////						predicate.getExpressions().add(cb.lessThanOrEqualTo(root.get("time"), log.getEtime()));
////					}
////				}
////				return predicate;
////			}
////		  },pageable);
////		return pageLog.getContent();
//
//		return null;
//	}

	@Override
	public Long getCount(Log log) {
//		Long count=logMapper.count(new Specification<Log>() {
//
//			@Override
//			public Predicate toPredicate(Root<Log> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				Predicate predicate=cb.conjunction();
//				if(log!=null){
//					if(log.getUser()!=null && StringUtil.isNotEmpty(log.getUser().getTrueName())){
//						predicate.getExpressions().add(cb.like(root.get("user").get("trueName"), "%"+log.getUser().getTrueName()+"%"));
//					}
//					if(StringUtil.isNotEmpty(log.getType())){
//						predicate.getExpressions().add(cb.equal(root.get("type"), log.getType()));
//					}
//					if(log.getBtime()!=null){
//						predicate.getExpressions().add(cb.greaterThanOrEqualTo(root.get("time"), log.getBtime()));
//					}
//					if(log.getEtime()!=null){
//						predicate.getExpressions().add(cb.lessThanOrEqualTo(root.get("time"), log.getEtime()));
//					}
//				}
//				return predicate;
//			}
//		});
//		return count;

		return null;
	}

}
