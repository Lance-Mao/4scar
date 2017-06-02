package servlet;

import dao.AdminDao1;
import entity.Admin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pc on 17-5-23.
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置字符编码集
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        //请求获取提交的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //封装获取的参数
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);

        AdminDao1 adminDao = new AdminDao1();
        if (adminDao.inquire(admin)) {
            request.setAttribute("info","登录成功！");
            request.getRequestDispatcher("/car/index.jsp").forward(request, response);
        }else {
            request.setAttribute("info","登录失败！");
            request.getRequestDispatcher("/car/loginOrregister.jsp").forward(request, response);
        }
    }
}
