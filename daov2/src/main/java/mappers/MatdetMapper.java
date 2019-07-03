package mappers;

import entity.Matdet;

import java.util.List;

public interface MatdetMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Matdet record);

    int insertSelective(Matdet record);

    Matdet selectByPrimaryKey(Long id);

    List<Matdet> selectAll();

    int updateByPrimaryKeySelective(Matdet record);

    int updateByPrimaryKey(Matdet record);
}