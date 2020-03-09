package com.yhl.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.yhl.entity.Address;
import com.yhl.entity.Admin;
import com.yhl.entity.Consumer;
import com.yhl.entity.Seller;
import com.yhl.entity.User;

public interface UserDao {

    /**
     * 根据userId进行查询
     * @param userId
     * @return
     */
    public User queryById(String userId);

    /**
     * 根据多个参数查询
     * @param userName
     * @param userAge
     * @return
     */
    public List<User> queryByAgeAndName(@Param("userName") String userName,@Param("userAge") Integer userAge);

	public void insertUser(User user1);

	public void deleteUser(User user1);

	public Consumer queryByNameAndPassword(Consumer consumer);

	public void insertConsumer(Consumer consumer);

	public Seller queryByNameAndPassword1(Seller seller);

	public void insertSeller(Seller seller);

	public Admin queryByNameAndPassword2(Admin admin);

	public List<Consumer> findAllConsumer();

	public List<Seller> findAllSeller();

	public void deleteConsumer(Consumer consumer);

	public void addConsumer(Consumer consumer);

	public void deleteSeller(Seller seller);

	public void addSeller(Seller seller);

	public Consumer query(Consumer consumer);

	public Consumer queryById(Consumer consumer);

	public List<Address> queryAddresseeById(Consumer consumer);

    

}
