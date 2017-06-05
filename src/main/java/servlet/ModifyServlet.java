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

@WebServlet(name = "ModifyServlet",urlPatterns = "/ModifyServlet")
public class ModifyServlet extends HttpServlet {
    private CarService carService = new CarService();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       try {
           req.setCharacterEncoding("utf-8");
           resp.setContentType("text/html;charset=utf-8");
           String models = req.getParameter("models");
           String price = req.getParameter("price");
           String size = req.getParameter("size");
           String fuel_consumption = req.getParameter("fuel_consumption");
           int number = Integer.parseInt(req.getParameter("number"));
           Car car = new Car(models, price, size, fuel_consumption,number);
           carService.modify(car);
           List<Car> carList = carService.result();
           req.setAttribute("carList",carList);
           req.getRequestDispatcher("/car/index.jsp").forward(req, resp);
       }catch (Exception e){
           e.printStackTrace();
       }
    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
