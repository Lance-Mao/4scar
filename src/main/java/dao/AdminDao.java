package dao;

import entity.Admin;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AdminDao {
    /**
     * 查询用户全部信息
     */
    public List<Admin> inquire() {
        Connection conn = DBConnection.getConn();
        String sql = "select * from Admin";
        QueryRunner queryRunner = new QueryRunner();
        try {
            List<Admin> list = queryRunner.query(conn, sql, new BeanListHandler<Admin>(Admin.class));
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 判断用户名是否存在
     */
    public boolean determineUserName(String name){
        Connection conn = DBConnection.getConn();
        String sql = "select * from Admin where username = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            if (!rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    /**
     * 保存用户注册的数据
     */
    public void save(Admin admin) {
        Connection conn = DBConnection.getConn();
        String sql = "insert into Admin(username,password) values(?,?)";
        QueryRunner queryRunner = new QueryRunner(true);

        try {
            queryRunner.update(conn, sql, admin.getUsername(), admin.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConn(conn);
        }

    }
}
