package service;

public interface CartService {
    boolean deleteCart(Integer[] cids);

    boolean addCart(Integer pId, Integer uid, Integer pNum);
}
