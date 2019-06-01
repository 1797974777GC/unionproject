package service.serviceImpl;

import mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Cart;
import service.CartService;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;

    @Override
    public boolean deleteCart(Integer[] cids) {
         int i= cartMapper.deleteBatch(cids);
         return i>0;
    }

    @Override
    public boolean addCart(Integer pId, Integer uid, Integer pNum) {
        Cart cart = new Cart();
        cart.setpId(pId);
        cart.setpNum(pNum);
        cart.setuId(uid);
        int i= cartMapper.insertSelective(cart);
        return i>0;
    }
}
