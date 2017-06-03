package dao;

import entity.Car;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pc on 17-5-23.
 */
public class CarDao {
    private static Connection conn;
    private static PreparedStatement pstmt;
    private static ResultSet rs;


    /**
         * 查询汽车信息，将查询到的信息保存到List集合中，回调到页面
     * @return
     */
    public List<Car> result() {
        Car car = null;
        List<Car> list = new LinkedList<Car>();
        conn = DBConnection.getConn();

        String sql = "select * from car";
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
//                car = new Car(models, price, size, fuel_consumption, number);
                car.setId(rs.getInt(1));
                car.setModels(rs.getString(2));
                car.setPrice(rs.getString(3));
                car.setSize(rs.getString(4));
                car.setFuel_consumption(rs.getString(5));
                car.setNumber(rs.getInt(6));

                list.add(car);
            }
            System.out.println(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public void save(Car car) {
        conn = DBConnection.getConn();
        String sql = "insert into car(models,price,size,fuel_consumption,number) values(?,?,?,?,?)";
        System.out.println(111);

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, car.getModels());
            pstmt.setString(2, car.getPrice());
            pstmt.setString(3, car.getSize());
            pstmt.setString(4, car.getFuel_consumption());
            pstmt.setInt(5, car.getNumber());

            pstmt.executeUpdate();

            //释放资源
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConn(conn);
        }
    }

    /**
     * 修改汽车信息
     */
    public void modify(Car car){
        conn = DBConnection.getConn();
        String sql = "update car set price = ?,size = ?,fuel_consumption = ?,number = ? where models = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,car.getPrice());
            pstm.setString(2,car.getSize());
            pstm.setString(3,car.getFuel_consumption());
            pstm.setInt(4,car.getNumber());
            pstm.setString(5,car.getModels());
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConn(conn);
        }
    }

    /**
     * 删除汽车信息
     */
}
