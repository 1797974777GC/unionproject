package service.serviceImpl;

import mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
