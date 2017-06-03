package servlet;

import entity.Car;
import service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ModifyServlet",urlPatterns = "/ModifyServlet")
public class ModifyServlet extends HttpServlet {
    private CarService carService = new CarService();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       try {
           req.setCharacterEncoding("utf-8");
           resp.setContentType("text/html;charset=utf-8");
           System.out.println(1111111111);
           String models = req.getParameter("models ");
           String price = req.getParameter("price ");
           String size = req.getParameter("size ");
           System.out.println(models);
           System.out.println(price);
           String fuel_consumption = req.getParameter("fuel_consumption ");
           int number = Integer.parseInt(req.getParameter("number "));
           System.out.println(0000);
           Car car = new Car(models, price, size, fuel_consumption,number);
           System.out.println(1111);
           carService.modify(car);
           System.out.println(123);
       }catch (Exception e){
           e.printStackTrace();
       }
    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
