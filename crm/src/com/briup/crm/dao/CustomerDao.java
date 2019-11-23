package com.briup.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.briup.crm.domain.Customer;
import com.briup.crm.domain.PageBean;

public interface CustomerDao {

	void add(Customer customer);

	Integer findCount(DetachedCriteria detachedCriteria);

	List<Customer> findByPage(DetachedCriteria detachedCriteria, Integer begin, Integer pageSize);

	Customer findById(Long cust_id);

	void delete(Customer customer);

	void update(Customer customer);

}
