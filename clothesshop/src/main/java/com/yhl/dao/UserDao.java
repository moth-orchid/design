package com.yhl.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
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

    

}
