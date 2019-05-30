package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pojo.Product;
import service.ProductService;


import java.util.List;

/**
 * @program: hospital-parent
 * @Date: 2019/5/28 20:30
 * @Author: Mr.Li
 * @Description:
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * Paging Shows all items
     *
     * @param page  Current page
     * @param limit Display the number of data per page
     * @return
     */
    @RequestMapping(value = "/product/", method = RequestMethod.GET)
    public Object queryProduct(@RequestParam Integer page,
                               @RequestParam Integer limit) {
        List<Product> products = productService.queryAll(page, limit);
        return products;
    }

    /**
     * Delete items based on product ID
     *
     * @param id productId
     * @return
     */
    @RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
    public Object deleteProduct(@PathVariable Integer id) {
        boolean f = productService.deleteById(id);
        return f;
    }

    /**
     * Bulk deletion of goods based on product ID
     *
     * @param ids Product ID Array
     * @return
     */
    @RequestMapping(value = "/product/", method = RequestMethod.DELETE)
    public Object deleteBatch(@RequestParam Long[] ids) {
        boolean f = productService.deleteBatch(ids);
        return f;
    }

    /**
     * Increase  goods
     *
     * @param product Products that need to be added
     * @return
     */
    @RequestMapping(value = "/product/", method = RequestMethod.POST)
    public Object addPro(Product product) {
        boolean f = productService.addPro(product);
        return f;
    }

    /**
     * Edit a product
     *
     * @param product The contents of the item that needs to be edited
     * @return
     */
    @RequestMapping(value = "/product/", method = RequestMethod.PUT)
    public Object modifyPro(Product product) {
        boolean f = productService.modifyPro(product);
        return f;
    }
}
