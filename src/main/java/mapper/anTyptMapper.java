package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.AnTypt;
import pojo.AnTyptExample;

public interface anTyptMapper {
    long countByExample(AnTyptExample example);

    int deleteByExample(AnTyptExample example);

    int deleteByPrimaryKey(Integer anTId);

    int insert(AnTypt record);

    int insertSelective(AnTypt record);

    List<AnTypt> selectByExample(AnTyptExample example);

    AnTypt selectByPrimaryKey(Integer anTId);

    int updateByExampleSelective(@Param("record") AnTypt record, @Param("example") AnTyptExample example);

    int updateByExample(@Param("record") AnTypt record, @Param("example") AnTyptExample example);

    int updateByPrimaryKeySelective(AnTypt record);

    int updateByPrimaryKey(AnTypt record);
}