package mappers;

import entity.Tmp;

public interface TmpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tmp record);

    int insertSelective(Tmp record);

    Tmp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tmp record);

    int updateByPrimaryKey(Tmp record);
}