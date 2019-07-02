package com.dao;

import com.model.Matmain;

public interface MatmainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Matmain record);

    int insertSelective(Matmain record);

    Matmain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Matmain record);

    int updateByPrimaryKey(Matmain record);
}