package com.yhl.entity;

public class User {

    //用户主键
    private Integer userId;

    //用户名
    private String userName;

    //用户年龄
    private Integer userAge;

    private Dog dog;
    
    public User() {
		// TODO Auto-generated constructor stub
	}
    
    public User(Integer userId, String userName, Integer userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
	}
	public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Integer getUserAge() {
        return userAge;
    }
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
    public Dog getDog() {
        return dog;
    }
    public void setDog(Dog dog) {
        this.dog = dog;
    }
    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName
                + ", userAge=" + userAge + ", dog=" + dog + "]";
    }


}