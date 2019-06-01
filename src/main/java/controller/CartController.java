package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pojo.CartExpend;
import pojo.User;
import service.CartService;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/deleteCart",method = RequestMethod.GET)
    public Object deleteCart(@RequestParam Integer[] cids){
            boolean f=cartService.deleteCart(cids);
            if (f){
                return "success";
            }
            return "error";
    }

    @RequestMapping(value = "/cart",method = RequestMethod.POST)
    public Object cart(@RequestParam Integer pId,
                       @RequestParam Integer pNum,
                       HttpSession session){

        User user = (User) session.getAttribute("activeUser");
        Integer uid = user.getuId();
        boolean b =cartService.addCart(pId,uid,pNum);
        if (b){
            return "success";
        }
        return "error";
    }

    @RequestMapping(value = "/usercart/{uid}",method = RequestMethod.GET)
    public Object userCart(@PathVariable Integer uid,
                            HttpSession session){

       //User user = (User) session.getAttribute("activeUser");
       //Integer uid = user.getuId();
        List<CartExpend> cartExpends = cartService.queryUserCart(uid);
        return cartExpends;
    }

}
