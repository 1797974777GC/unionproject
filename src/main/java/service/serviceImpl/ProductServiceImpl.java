package service.serviceImpl;

import mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Product;
import service.ProductService;


import java.util.List;

/**
 * @program: hospital-parent
 * @Date: 2019/5/28 20:35
 * @Author: Mr.Li
 * @Description:
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    /**
     * Paging Shows all items
     *
     * @param page  Current page
     * @param limit Display the number of data per page
     * @return
     */
    @Override
    public List<Product> queryAll(Integer page, Integer limit) {
        List<Product> products = productMapper.queryAllByPage((page - 1) * limit, limit);
        Long count = productMapper.countByExample(null);

        return products;
    }

    /**
     * Delete items based on product ID
     *
     * @param id productId
     * @return
     */
    @Override
    public boolean deleteById(Integer id) {
        return productMapper.deleteByPrimaryKey(id) > 0;
    }

    /**
     * Bulk deletion of goods based on product ID
     *
     * @param ids Product ID Array
     * @return
     */
    @Override
    public boolean deleteBatch(Long[] ids) {
        if (ids.length > 0) {
            int i = productMapper.deleteBatch(ids);
            return i > 0;
        }
        return false;
    }

    /**
     * Increase  goods
     *
     * @param product Products that need to be added
     * @return
     */
    @Override
    public boolean addPro(Product product) {
        int i = productMapper.insertSelective(product);
        return i > 0;
    }

    @Override
    public boolean modifyPro(Product product) {
        return productMapper.updateByPrimaryKeySelective(product) > 0;
    }
}
