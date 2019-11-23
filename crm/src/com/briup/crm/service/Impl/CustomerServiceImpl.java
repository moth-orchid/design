package com.briup.crm.service.Impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import com.briup.crm.dao.CustomerDao;
import com.briup.crm.domain.Customer;
import com.briup.crm.domain.PageBean;
import com.briup.crm.service.CustomerService;
@Transactional
public class CustomerServiceImpl implements CustomerService{
	private CustomerDao  customerDao;
	
	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	@Override
	public void add(Customer customer) {
		customerDao.add(customer);
		
	}
	@Override
	public PageBean<Customer> findByPage(DetachedCriteria detachedCriteria, Integer currPage,Integer pageSize) {
		PageBean<Customer> pageBean=new PageBean<Customer>();
		//封装当前页数
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数
		pageBean.setPageSize(pageSize);
		//封装总的记录数
		//调用Dao
		Integer  totalCount=customerDao.findCount(detachedCriteria);
		pageBean.setTotalCount(totalCount);
		//封装总页数
		Double tc=totalCount.doubleValue();
		Double num = Math.ceil(tc/pageSize);
		pageBean.setTotalPage(num.intValue());
		//封装每页显示数据的集合
		Integer  begin=(currPage-1) * pageSize;
		System.out.println(begin+"//////////////");
		List<Customer> list=customerDao.findByPage(detachedCriteria, begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}
	@Override
	public Customer findById(Long cust_id) {
		Customer customer=customerDao.findById(cust_id);
		return customer;
	}
	@Override
	public void delete(Customer customer) {
		customerDao.delete(customer);
		
	}
	@Override
	public void update(Customer customer) {
		customerDao.update(customer);
		
	}


}
