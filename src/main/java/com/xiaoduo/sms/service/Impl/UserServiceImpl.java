package com.xiaoduo.sms.service.Impl;

import java.util.List;

import com.xiaoduo.sms.entity.User;
import com.xiaoduo.sms.mapper.UserMapper;
import com.xiaoduo.sms.service.UserService;
import com.xiaoduo.sms.util.StringUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户Service实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findByUserName(String userName) {

        return userMapper.findByUserName(userName);
    }

    @Override
    public User findById(Integer id) {

//        return userMapper.findOne(id);

        return null;
    }

    @Override
    public void save(User user) {

//        userMapper.save(user);
    }

//    @Override
//    public List<User> list(User user, Integer page, Integer pageSize, Sort.Direction direction, String... properties) {
//
////        Pageable pageable = new PageRequest(page - 1, pageSize, direction, properties);
//
////        Page<User> pageUser = userMapper.findAll(new Specification<User>() {
////
////            @Override
////            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////                Predicate predicate = cb.conjunction();
////                if (user != null) {
////                    if (StringUtil.isNotEmpty(user.getUserName())) {
////                        predicate.getExpressions().add(cb.like(root.get("userName"), "%" + user.getUserName().trim() + "%"));
////                    }
////                    predicate.getExpressions().add(cb.notEqual(root.get("id"), 1)); // 管理员除外
////                }
////                return predicate;
////            }
////        }, pageable);
////        return pageUser.getContent();
//
//        return null;
//    }

    @Override
    public Long getCount(User user) {

//        Long count = userMapper.count(new Specification<User>() {
//
//            @Override
//            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//                Predicate predicate = cb.conjunction();
//                if (user != null) {
//                    if (StringUtil.isNotEmpty(user.getUserName())) {
//                        predicate.getExpressions().add(cb.like(root.get("userName"), "%" + user.getUserName().trim() + "%"));
//                    }
//                    predicate.getExpressions().add(cb.notEqual(root.get("id"), 1)); // 管理员除外
//                }
//                return predicate;
//            }
//        });
//        return count;

        return null;
    }

    @Override
    public void delete(Integer id) {

//        userMapper.delete(id);
    }


}
