package dao;

import entity.Admin;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by pc on 17-5-23.
 */
public class AdminDao1 {

    /**
     * 在用户提交注册信息时，需要判断该用户名是否存在
     * 返回一个boolean类型的值
     */
    public boolean inquire(Admin admin){
        Connection conn = DBConnection.getConn();
        //根据指定的用户名查询信息
        String sql = "select * from Admin where username = ?";

        try {
            //获取PreparedStatement对象，用于执行数据库查询
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            System.out.println(admin.getUsername());
            preparedStatement.setString(1, admin.getUsername());
            //执行查询获取结果集
            ResultSet resultSet = preparedStatement.executeQuery();
            if (!resultSet.next()) {
                //如果没有此数据，证明该用户名可用
                return true;
            }
            //释放资源,后创建的先销毁
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConn(conn);
        }

        return false;
    }

    /**
     * 在登录时，判断用户输入的用户名与密码是否输入正确
     * 返回一个boolean
     */
    public boolean determineUAndP(Admin admin){
        Connection conn = DBConnection.getConn();
        String sql = "select * from Admin where username = ? AND password = ?";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, admin.getUsername());
            pst.setString(2, admin.getPassword());
            ResultSet rs = pst.executeQuery();
            System.out.println(rs);
            if (rs.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    /**
     * 在用户提交注册信息时，如果注册成功，需要将用户注册的信息存入数据库
     */

    public void save(Admin admin) {
        //获取数据库连接
        Connection conn = DBConnection.getConn();
        //插入信息的sql语句
        String sql = "insert into Admin(username,password) values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, admin.getUsername());
            ps.setString(2, admin.getPassword());

            //执行更新操作
            ps.executeUpdate();
            //释放资源
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.closeConn(conn);
        }
    }

}
