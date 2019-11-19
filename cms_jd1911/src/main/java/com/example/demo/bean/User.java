package com.example.demo.bean;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.username
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.password
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.telephone
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.realname
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.gender
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.birth
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private Date birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.register_time
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private Date registerTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.status
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.user_face
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    private byte[] userFace;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.id
     *
     * @return the value of cms_user.id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.id
     *
     * @param id the value for cms_user.id
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.username
     *
     * @return the value of cms_user.username
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.username
     *
     * @param username the value for cms_user.username
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.password
     *
     * @return the value of cms_user.password
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.password
     *
     * @param password the value for cms_user.password
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.telephone
     *
     * @return the value of cms_user.telephone
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.telephone
     *
     * @param telephone the value for cms_user.telephone
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.realname
     *
     * @return the value of cms_user.realname
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.realname
     *
     * @param realname the value for cms_user.realname
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.gender
     *
     * @return the value of cms_user.gender
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.gender
     *
     * @param gender the value for cms_user.gender
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.birth
     *
     * @return the value of cms_user.birth
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.birth
     *
     * @param birth the value for cms_user.birth
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.register_time
     *
     * @return the value of cms_user.register_time
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.register_time
     *
     * @param registerTime the value for cms_user.register_time
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.status
     *
     * @return the value of cms_user.status
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.status
     *
     * @param status the value for cms_user.status
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.user_face
     *
     * @return the value of cms_user.user_face
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public byte[] getUserFace() {
        return userFace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.user_face
     *
     * @param userFace the value for cms_user.user_face
     *
     * @mbg.generated Mon Nov 18 17:26:16 CST 2019
     */
    public void setUserFace(byte[] userFace) {
        this.userFace = userFace;
    }
}