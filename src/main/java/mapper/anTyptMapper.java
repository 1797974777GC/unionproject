package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.anTypt;
import pojo.anTyptExample;

public interface anTyptMapper {
    long countByExample(anTyptExample example);

    int deleteByExample(anTyptExample example);

    int deleteByPrimaryKey(Integer anTId);

    int insert(anTypt record);

    int insertSelective(anTypt record);

    List<anTypt> selectByExample(anTyptExample example);

    anTypt selectByPrimaryKey(Integer anTId);

    int updateByExampleSelective(@Param("record") anTypt record, @Param("example") anTyptExample example);

    int updateByExample(@Param("record") anTypt record, @Param("example") anTyptExample example);

    int updateByPrimaryKeySelective(anTypt record);

    int updateByPrimaryKey(anTypt record);
}