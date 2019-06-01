package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.CartService;

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
}
