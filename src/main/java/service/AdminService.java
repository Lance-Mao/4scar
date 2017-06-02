package service;

import dao.AdminDao1;
import entity.Admin;

public class AdminService {
    private AdminDao1 adminDao = new AdminDao1();
    public boolean inquire(Admin admin){
        return adminDao.inquire(admin);
    }

    public void save(Admin admin) {
        adminDao.save(admin);
    }
}
