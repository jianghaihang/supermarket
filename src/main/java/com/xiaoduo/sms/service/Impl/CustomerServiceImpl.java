package com.xiaoduo.sms.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiaoduo.sms.entity.Customer;
import com.xiaoduo.sms.mapper.CustomerMapper;
import com.xiaoduo.sms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 客户Service实现类
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public void save(Customer customer) {

//		customerMapper.save(customer);

    }

//    @Override
//    public List<Customer> list(Customer customer, Integer page, Integer pageSize, Direction direction, String... properties) {
//
//        Pageable pageable = new PageRequest(page - 1, pageSize, direction, properties);
//
////        Page<Customer> pageCustomer = customerMapper.findAll(new Specification<Customer>() {
////
////            @Override
////            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////                Predicate predicate = cb.conjunction();
////                if (customer != null) {
////                    if (StringUtil.isNotEmpty(customer.getName())) {
////                        predicate.getExpressions().add(cb.like(root.get("name"), "%" + customer.getName().trim() + "%"));
////                    }
////                }
////                return predicate;
////            }
////        }, pageable);
//
////        return pageCustomer.getContent();
//
//        return null;
//    }

    @Override
    public Long getCount(Customer customer) {

//        Long count = customerMapper.count(new Specification<Customer>() {
//
//            @Override
//            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//                Predicate predicate = cb.conjunction();
//                if (customer != null) {
//                    if (StringUtil.isNotEmpty(customer.getName())) {
//                        predicate.getExpressions().add(cb.like(root.get("name"), "%" + customer.getName().trim() + "%"));
//                    }
//                }
//                return predicate;
//            }
//        });

//        return count;

        return null;
    }

    @Override
    public void delete(Integer id) {

//        customerMapper.delete(id);

    }

    @Override
    public Customer findById(Integer id) {

//        return customerMapper.findOne(id);

        return null;
    }

    @Override
    public List<Customer> findByName(String name) {

        return customerMapper.findByName(name);
    }


}
