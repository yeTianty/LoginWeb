package com.dao;

import com.util.DBconnImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author setusb
 * @version 1.0
 * @date 2020/11/22 20:50
 */
public class UserDaoImpl extends DBconnImpl implements UserDao {
    @Override
    public void userRegister(String name, String password) {
        int competence = 0;
        long money = 0;
        link();
        modify("insert user(name,password,competence,money) values ('" + name + "','" + password + "','" + competence + "','" + money + "')");
        close();
    }

    @Override
    public boolean userLogin(String name, String password) {
        boolean flag = false;
        try {
            link();
            ResultSet rs = inquiry("select * from user where name='"+name+"' and password='"+password+"'");
            while(rs.next()){
                if(rs.getString("name").equals(name) && rs.getString("password").equals(password)){
                    flag = true;
                }
            }
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
}
