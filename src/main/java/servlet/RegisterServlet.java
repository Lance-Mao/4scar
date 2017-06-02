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
@WebServlet(name = "RegisterServlet",urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    //将获取到的参数保存到数据库
    private AdminService adminService = new AdminService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置字符编码集
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        System.out.println(12);

        //请求获取提交的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //封装获取的参数
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);

        System.out.println(admin);

        //判断数据库是否存在相同的用户名
        if (adminService.inquire(admin)){
            //如果不存在，将其保存到数据库中
            adminService.save(admin);
            System.out.println(admin);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
