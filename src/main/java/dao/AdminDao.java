package dao;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import util.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class AdminDao {
    /**
     * 保存用户注册的数据
     */
    @Test
    public void save(){
        Connection conn = DBConnection.getConn();
        String sql = "insert into Admin(username,password) values(?,?)";
        QueryRunner queryRunner = new QueryRunner(true);

        try {
            queryRunner.update(conn, sql,"李四","123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
