package servlet;

import dao.CarDao;
import entity.Car;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by pc on 17-5-23.
 */
@WebServlet(name = "addCarServlet",urlPatterns = "/addCarServlet")
public class addCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置字符编码集
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        //请求获取提交的参数
        String models = request.getParameter("models");
        System.out.println(models);
        String price = request.getParameter("price");
        String size = request.getParameter("size");
        String fuel_consumption = request.getParameter("fuel_consumption");
        int number = Integer.parseInt(request.getParameter("number"));

        Car car = new Car();
        car.setModels(models);
        car.setPrice(price);
        car.setSize(size);
        car.setFuel_consumption(fuel_consumption);
        car.setNumber(number);



        CarDao carDao = new CarDao();
        //将数据保存到数据库中
        carDao.save(car);
        //获取数据库查询的信息
        List<Car> carList  = carDao.result();
        JSONArray jsonArray = JSONArray.fromObject(carList);
        response.getWriter().println(jsonArray);
    }
}
