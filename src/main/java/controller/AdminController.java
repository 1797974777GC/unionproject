package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Admin;
import service.adminService;

@RequestMapping("/admin")
@RestController
public class AdminController {
    @Autowired
    private adminService adminService;
    @RequestMapping("/login")
    public Object aLogin(String aName,String aPwd){
       Admin admin = adminService.Login(aName,aPwd);
       return admin;
    }
}
