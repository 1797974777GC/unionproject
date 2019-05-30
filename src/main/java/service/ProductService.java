package service;

import pojo.Product;
import vo.ResultVO;

/**
 * @program: hospital-parent
 * @Date: 2019/5/28 20:32
 * @Author: Mr.Li
 * @Description:
 */
public interface ProductService {
    ResultVO queryAll(Integer page, Integer limit);

    boolean deleteById(Integer id);

    boolean deleteBatch(Long[] ids);

    boolean addPro(Product product);

    boolean modifyPro(Product product);
}
