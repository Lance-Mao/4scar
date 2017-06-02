package service;

import dao.AdminDao1;
import entity.Admin;

public class AdminService {
    private AdminDao1 adminDao = new AdminDao1();

    /**
     * 查询用户名
     * @param admin
     * @return
     */
    public boolean determineUserName(Admin admin){
        return adminDao.inquire(admin);
    }

    /**
     * 查询用户名与密码
     * 登录时用
     */
    public boolean determineUAndP(Admin admin){
        return adminDao.determineUAndP(admin);
    }

    /**
     * 保存用户注册信息
     * @param admin
     */
    public void save(Admin admin) {
        adminDao.save(admin);
    }
}
