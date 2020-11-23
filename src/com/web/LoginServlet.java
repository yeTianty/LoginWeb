package com.web;

import com.dao.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2020/11/22 22:03
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        UserDaoImpl userDao = new UserDaoImpl();
        boolean flag = userDao.userLogin(name, password);
        String str = "无登录信息";
        if (flag) {
            str = "恭喜您" + name + "登录成功！";
        } else {
            str = name + "登录失败";
        }
        request.setAttribute("str", str);
        request.getRequestDispatcher("/window.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
