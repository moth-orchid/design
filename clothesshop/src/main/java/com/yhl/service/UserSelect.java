package com.yhl.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.yhl.entity.Address;
import com.yhl.entity.Admin;
import com.yhl.entity.Clothes;
import com.yhl.entity.Consumer;
import com.yhl.entity.Seller;
import com.yhl.entity.User;
@Service
public interface UserSelect {
	/**
     * 根据多个参数查询
     * @param userName
     * @param userAge
     * @return
     */
    public List<User> queryByAgeAndName(@Param("userName") String userName,@Param("userAge") Integer userAge);

	public void insertUser(User user1);

	public void deleteUser(User user1);

	public Boolean queryByNameAndPassword(Consumer consumer);

	public void insertCustomer(Consumer consumer);

	public Boolean queryByNameAndPassword1(Seller seller);

	public void insertSeller(Seller seller);

	public Boolean queryByNameAndPassword2(Admin admin);

	public List<Consumer> findAllConsumer();

	public List<Seller> findAllSeller();

	public void deleteConsumer(Consumer consumer);

	public void addConsumer(Consumer consumer);

	public void deleteSeller(Seller seller);

	public void addSeller(Seller seller);

	public Consumer query(Consumer consumer);

	public Consumer queryById(Consumer consumer);

	public List<Address> queryAddresseeById(Consumer consumer);

	public void addAddress(Address address);

	public void deleteAddress(Address address);

	public Integer queryByNameAndPassword2(Seller seller);

	public List<Clothes> selectAllClothes();

	public void clothesDelete(Integer clothesId);
}
