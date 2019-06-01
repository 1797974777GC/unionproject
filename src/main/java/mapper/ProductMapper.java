package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Product;
import pojo.ProductExample;

import java.util.List;

public interface ProductMapper {
    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> queryAllByPage(@Param("page") Integer page, @Param("limit") Integer limit);

    int deleteBatch(@Param("ids") Long[] ids);

    List<Product> queryProducts(@Param("page") int i, @Param("limit") Integer limit, @Param("pName")String pName);
}