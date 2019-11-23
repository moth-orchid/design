package com.briup.crm.dao.Impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.briup.crm.dao.CustomerDao;
import com.briup.crm.domain.Customer;
import com.briup.crm.domain.PageBean;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{
	//添加客户
	@Override
	public void add(Customer customer) {
		this.getHibernateTemplate().save(customer);
		
	}
	//显示客户列表
	//带条件去统计个数
	@Override
	public Integer findCount(DetachedCriteria detachedCriteria) {
		detachedCriteria.setProjection(Projections.rowCount());
		List<Long> list=(List<Long>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
		if(list.size()>0) {
			return list.get(0).intValue();
		}
		return null;
	}

	@Override
	//dao中分页查询客户
	public List<Customer> findByPage(DetachedCriteria detachedCriteria, Integer begin, Integer pageSize) {
		detachedCriteria.setProjection(null);
		return (List<Customer>) this.getHibernateTemplate().findByCriteria(detachedCriteria,begin,pageSize);
	
	}
	//根据id平查询客户
	@Override
	public Customer findById(Long cust_id) {
		return this.getHibernateTemplate().get(Customer.class, cust_id);
	}
	@Override
	public void delete(Customer customer) {
		this.getHibernateTemplate().delete(customer);
		
	}
	@Override
	public void update(Customer customer) {
		this.getHibernateTemplate().update(customer);
		
	}
	
	

}
