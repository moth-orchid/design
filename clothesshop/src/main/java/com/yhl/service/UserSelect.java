package com.yhl.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

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
}
