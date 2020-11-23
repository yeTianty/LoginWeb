package com.util;

import java.sql.ResultSet;

/**
 * @author setusb
 * @version 1.0
 * @date 2020/11/22 20:54
 */
public interface DBconn {
    /**
     * 数据库连接
     */
    public void link();

    /**
     * 查询数据库
     */
    public ResultSet inquiry(String sql);

    /**
     * 修改数据库
     */
    public int modify(String sql);

    /**
     * 关闭数据库
     */
    public void close();
}
