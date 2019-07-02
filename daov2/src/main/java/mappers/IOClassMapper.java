package com.dao;

import com.model.IOClass;

public interface IOClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IOClass record);

    int insertSelective(IOClass record);

    IOClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IOClass record);

    int updateByPrimaryKey(IOClass record);
}