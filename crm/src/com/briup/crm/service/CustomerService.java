package com.briup.crm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.briup.crm.domain.Customer;
import com.briup.crm.domain.PageBean;

public interface CustomerService {

	void add(Customer customer);

	PageBean<Customer> findByPage(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize);

	Customer findById(Long cust_id);

	void delete(Customer customer);

	void update(Customer customer);


}
