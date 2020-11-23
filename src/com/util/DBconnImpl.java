package com.util;

import java.sql.*;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2020/11/22 20:57
 */
public class DBconnImpl implements DBconn {
    static String url = "jdbc:mysql://39.99.209.230:3306/loginweb?useunicuee=true&characterEncoding=utf8";
    static String username = "root";
    static String password = "setusb";
    static Connection conn = null;
    static ResultSet rs = null;
    static PreparedStatement ps = null;

    @Override
    public void link() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("数据库连接模块出错！");
            e.printStackTrace();
        }
    }

    @Override
    public ResultSet inquiry(String sql) {
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("数据库查询模块出错！");
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int modify(String sql) {
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            i = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("数据库修改模块出错！");
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("数据库关闭模块出错！");
            e.printStackTrace();
        }
    }
}
