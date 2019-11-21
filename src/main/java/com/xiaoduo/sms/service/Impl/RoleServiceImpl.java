package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.Role;
import com.xiaoduo.sms.entity.RoleMenu;
import com.xiaoduo.sms.mapper.RoleMapper;
import com.xiaoduo.sms.service.RoleService;
import com.xiaoduo.sms.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 角色Service实现类
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public List<Role> findByUserId(Integer id) {

		return roleMapper.findByUserId(id);

	}

	@Override
	public Role findById(Integer id) {

//		return roleMapper.findOne(id);

		return null;
	}

	@Override
	public List<Role> listAll() {

//		return roleMapper.findAll();

		return null;
	}

//	@Override
//	public List<Role> list(Role role, Integer page, Integer pageSize, Direction direction, String... properties) {
//		Pageable pageable=new PageRequest(page-1, pageSize, direction,properties);
////		Page<Role> pageUser=roleMapper.findAll(new Specification<Role>() {
////
////			@Override
////			public Predicate toPredicate(Root<Role> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////				Predicate predicate=cb.conjunction();
////				if(role!=null){
////					if(StringUtil.isNotEmpty(role.getName())){
////						predicate.getExpressions().add(cb.like(root.get("name"), "%"+role.getName().trim()+"%"));
////					}
////					predicate.getExpressions().add(cb.notEqual(root.get("id"), 1)); // 管理员角色除外
////				}
////				return predicate;
////			}
////		}, pageable);
////		return pageUser.getContent();
//
//		return null;
//	}

	@Override
	public Long getCount(Role role) {
//		Long count=roleMapper.count(new Specification<Role>() {
//
//			@Override
//			public Predicate toPredicate(Root<Role> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				Predicate predicate=cb.conjunction();
//				if(role!=null){
//					if(StringUtil.isNotEmpty(role.getName())){
//						predicate.getExpressions().add(cb.like(root.get("name"), "%"+role.getName().trim()+"%"));
//					}
//					predicate.getExpressions().add(cb.notEqual(root.get("id"), 1)); // 管理员角色除外
//				}
//				return predicate;
//			}
//		});
//		return count;

		return null;
	}

	@Override
	public void save(Role role) {

//		roleMapper.save(role);
	}

	@Override
	public void delete(Integer id) {

//		roleMapper.delete(id);
	}

}
