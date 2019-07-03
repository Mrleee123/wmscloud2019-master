package mappers;

import entity.Matmain;

import java.util.List;

public interface MatmainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Matmain record);

    int insertSelective(Matmain record);

    Matmain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Matmain record);

    int updateByPrimaryKey(Matmain record);

    List<Matmain> selectAll();
}