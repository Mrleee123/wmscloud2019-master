package com.dao;

import com.model.Name;

public interface NameMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Name record);

    int insertSelective(Name record);

    Name selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Name record);

    int updateByPrimaryKey(Name record);
}