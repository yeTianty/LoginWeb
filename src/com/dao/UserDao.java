package com.dao;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2020/11/22 20:48
 */
public interface UserDao {
    /**
     * 注册用户
     */
    public void userRegister(String name, String password);

    /**
     * 登录用户
     */
    public boolean userLogin(String name, String password);
}
