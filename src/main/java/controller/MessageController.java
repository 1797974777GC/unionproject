package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pojo.Message;
import pojo.User;
import service.MessageService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    /**
     * 用户留言
     */
    @RequestMapping(value = "/message",method = RequestMethod.POST)
    public Object message(@RequestParam String mMessage,
                          HttpSession session){

        User user = (User) session.getAttribute("activeUser");
        if (user==null){
            return "error";
        }
        Integer uid = user.getuId();
        Boolean b = messageService.addmessage(mMessage, uid);
        if (b){
            return "success";
        }

        return "error";

    }

    /**
     * 显示新闻
     * @return
     */
    @RequestMapping(value = "/news",method = RequestMethod.GET)
    public Object showNews(){

        List<Message> list =messageService.showNews();


        return list;
    }




}
