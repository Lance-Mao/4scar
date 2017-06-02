package servlet;

import entity.Admin;
import service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pc on 17-5-23.
 */
@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private AdminService adminService = new AdminService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置字符编码集
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        //请求获取提交的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(2222222);
        //封装获取的参数
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);

        if (adminService.determineUAndP(admin)) {
//            request.setAttribute("info", "登录成功！");
//            request.getRequestDispatcher("/car/index.jsp").forward(request, response);
            response.sendRedirect("/car/index.jsp");
        } else {


           request.getSession().setAttribute("info", "登录失败！");
            response.sendRedirect("/car/loginOrregister.jsp");
        }
    }
}
