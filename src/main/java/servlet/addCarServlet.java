package servlet;

import entity.Car;
import service.CarService;

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
    private CarService carService = new CarService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置字符编码集
        try {
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

            //将数据保存到数据库中
            carService.saveCar(car);
            //获取数据库查询的信息
            List<Car> carList = carService.result();
            System.out.println(carList);
//            JSONArray jsonArray = JSONArray.fromObject(carList);
//            request.getSession().setAttribute("carList",carList);
//            response.sendRedirect("/car/index.jsp");
            request.setAttribute("carList",carList);
            request.getRequestDispatcher("/car/index.jsp").forward(request, response);

//            PrintWriter out = response.getWriter();
//            //将数据拼接成JSON格式
//            out.print(carList);
//            out.flush();
//            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
