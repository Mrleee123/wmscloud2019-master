package com.dao;

import com.model.Matdet;

public interface MatdetMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Matdet record);

    int insertSelective(Matdet record);

    Matdet selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Matdet record);

    int updateByPrimaryKey(Matdet record);
}