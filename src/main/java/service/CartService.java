package service;

import pojo.CartExpend;

import java.util.List;

public interface CartService {
    boolean deleteCart(Integer[] cids);

    boolean addCart(Integer pId, Integer uid, Integer pNum);


    List<CartExpend> queryUserCart(Integer uid);
}
