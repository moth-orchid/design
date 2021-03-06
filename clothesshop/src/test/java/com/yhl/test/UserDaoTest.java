package com.yhl.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yhl.dao.ClothesDao;
import com.yhl.dao.UserDao;
import com.yhl.entity.Address;
import com.yhl.entity.Clothes;
import com.yhl.entity.Consumer;
import com.yhl.entity.RealShopCart;
import com.yhl.entity.User;

public class UserDaoTest extends BaseTest{

    @Autowired
    private UserDao userDao;
    
    @Autowired
	private ClothesDao clothesDao;


    @Test
    public void testQueryById(){
        String userId="1";
        User user=userDao.queryById(userId);
        System.out.println(user);
    }
    
    @Test
    public void testQueryByAgeAndName() {
    	String userName="wuk";
    	int userAge=24;
    	List<User> user=userDao.queryByAgeAndName(userName, userAge);
    	System.out.println(user);
    }
    
    @Test
    public void testQueryByIdAdd() {
    	Consumer consumer=new Consumer();
    	consumer.setConsumerId(1);
    	List<Address> list=userDao.queryAddresseeById(consumer);
    	System.out.println(list);
    	
    }
    
    @Test
    public void testQuery() {
    	List<RealShopCart> realShopCart=clothesDao.sellectShopCart(1);
    	System.out.println(realShopCart);
    	
    }
    
    
}
