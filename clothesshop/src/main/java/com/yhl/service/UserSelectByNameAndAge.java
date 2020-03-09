package com.yhl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhl.dao.UserDao;
import com.yhl.entity.Address;
import com.yhl.entity.Admin;
import com.yhl.entity.Consumer;
import com.yhl.entity.Seller;
import com.yhl.entity.User;
@Service
public class UserSelectByNameAndAge implements UserSelect{
	
	
	@Autowired
	private UserDao userDao;
	 
	/*
	 * @Override public List<User> queryByAgeAndName(String userName, Integer
	 * userAge) { List<User> list=userDao.queryByAgeAndName(userName, userAge);
	 * return list; }
	 * 
	 * @Override public void insertUser(User user1) { userDao.insertUser(user1);
	 * 
	 * }
	 * 
	 * @Override public void deleteUser(User user1) { userDao.deleteUser(user1);
	 * 
	 * }
	 */

	@Override
	public Boolean queryByNameAndPassword(Consumer consumer) {
		System.out.println("进入服务层");
		Consumer consumer1=userDao.queryByNameAndPassword(consumer);
		System.out.println("////");
		System.out.println(consumer1);
		if(consumer1==null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public void insertCustomer(Consumer consumer) {
		userDao.insertConsumer(consumer);
		
	}

	@Override
	public List<User> queryByAgeAndName(String userName, Integer userAge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(User user1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean queryByNameAndPassword1(Seller seller) {
		System.out.println("进入服务层");
		Seller seller1=userDao.queryByNameAndPassword1(seller);
		System.out.println("////");
		System.out.println(seller1);
		if(seller1==null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public void insertSeller(Seller seller) {
		userDao.insertSeller(seller);
	}

	@Override
	public Boolean queryByNameAndPassword2(Admin admin) {
		System.out.println("进入服务层");
		Admin admin1=userDao.queryByNameAndPassword2(admin);
		System.out.println("////");
		System.out.println(admin1);
		if(admin1==null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public List<Consumer> findAllConsumer() {
		List<Consumer> list=userDao.findAllConsumer();
		return list;
	}

	@Override
	public List<Seller> findAllSeller() {
		List<Seller> list=userDao.findAllSeller();
		return list;
	}

	@Override
	public void deleteConsumer(Consumer consumer) {
		userDao.deleteConsumer(consumer);
		
	}

	@Override
	public void addConsumer(Consumer consumer) {
		System.out.println("服务层添加消费者");
		userDao.addConsumer(consumer);
		
	}

	@Override
	public void deleteSeller(Seller seller) {
		userDao.deleteSeller(seller);
		
	}

	@Override
	public void addSeller(Seller seller) {
		System.out.println("服务层添加商家");
		userDao.addSeller(seller);
		
	}

	@Override
	public Consumer query(Consumer consumer) {
		return userDao.query(consumer);
	}

	@Override
	public Consumer queryById(Consumer consumer) {
		return userDao.queryById(consumer);
	}

	@Override
	public List<Address> queryAddresseeById(Consumer consumer) {
		List<Address> list=userDao.queryAddresseeById(consumer);
		return list;
	}
	
}
