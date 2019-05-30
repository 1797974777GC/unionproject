package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Animal;
import pojo.AnimalExample;

public interface AnimalMapper {
    long countByExample(AnimalExample example);

    int deleteByExample(AnimalExample example);

    int deleteByPrimaryKey(Integer anId);

    int insert(Animal record);

    int insertSelective(Animal record);

    List<Animal> selectByExample(AnimalExample example);

    Animal selectByPrimaryKey(Integer anId);

    int updateByExampleSelective(@Param("record") Animal record, @Param("example") AnimalExample example);

    int updateByExample(@Param("record") Animal record, @Param("example") AnimalExample example);

    int updateByPrimaryKeySelective(Animal record);

    int updateByPrimaryKey(Animal record);
}