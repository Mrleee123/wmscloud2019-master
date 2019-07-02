package mappers;

import entity.Devdef;

public interface DevdefMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Devdef record);

    int insertSelective(Devdef record);

    Devdef selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Devdef record);

    int updateByPrimaryKey(Devdef record);
}