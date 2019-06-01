package com.ssm.controller;

import com.google.code.kaptcha.Constants;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import com.ssm.utils.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/login")
    @ResponseBody
    public Object Userlogin(@RequestParam String account,
                            @RequestParam String pwd){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(account, pwd);
        token.setRememberMe(true);
        User user=null;
   try{
        subject.login(token);
        user = userService.queryUserByaccount(account);
        subject.getSession().setAttribute("activeUser",user);

    } catch (
    UnknownAccountException uae) {
        log.error("没有该用户---------------》 " + token.getPrincipal());
        return "error";
    } catch (
    IncorrectCredentialsException ice) {
        log.error("密码不正确---------------------》 " + token.getPrincipal() + " was incorrect!");
        return "error";
    } catch (
    LockedAccountException lae) {
        log.error("用户锁定 " + token.getPrincipal() + " is locked.  " +
                "Please contact your administrator to unlock it.");
        return "error";
    }
    // ... catch more exceptions here (maybe custom ones specific to your application?
        catch (
    AuthenticationException ae) {
        //unexpected condition?  error?
        log.error("其他的异常---------------------》");
        return "error";
    }

        return "success";

    }


    @RequestMapping("/user/checkAccount")
    @ResponseBody
    public Object checkAccount(@RequestParam String account){
        boolean b = userService.checkAccount(account);
        if(b){
             return "error";
        }else {
            return "success";
        }
    }
    @RequestMapping("/user/register")
    @ResponseBody
    public Object register(User user,
                           @RequestParam String imgCode,
                           HttpSession session){
        String code_ = (String) session.getAttribute(Constants.KAPTCHA_SESSION_KEY);

        if(!code_.equalsIgnoreCase(imgCode)){
           return "error";
        }
        user.setuPwd(MD5Utils.encrypt(user.getuPwd()));
        boolean b = userService.register(user);
        if(b){
            return "success";
        }else{
            return "error";
        }
    }

}
