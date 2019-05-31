package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pojo.Admin;
import pojo.Message;
import service.AdminService;

import java.util.List;

@RequestMapping("/admin")
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object aLogin(String aAccount,String aPwd){
       Admin admin =  adminService.Login(aAccount,aPwd);

       if(admin!=null){
           return admin;
       }else {
           return "error";
       }
    }
    @RequestMapping("/showmessage")
    public Object showMessage(){
       List<Message> messages =  adminService.showMessage();
       if(messages!=null&&messages.size()>0){
           return  messages;
       }else {
           return "error";
       }
    }
    @RequestMapping("/addmessage")
    public  Object addMessage(String message){
        int row = adminService.addMessage(message);
        if(row>0){
            return "success";
        }else {
            return "error";
        }
    }
}
