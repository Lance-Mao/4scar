package service;

import dao.CarDao;
import entity.Car;

import java.util.List;

public class CarService {
    private CarDao carDao= new CarDao();
    /**
     * 添加汽车信息
     */
    public void saveCar(Car car){
        carDao.save(car);
    }

    /**
     * 查询汽车信息，将查询到的信息保存到List集合中，回调到页面
     */
    public List<Car> result() {
        return carDao.result();
    }
}
