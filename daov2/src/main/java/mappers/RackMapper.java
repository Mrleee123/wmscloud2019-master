package com.dao;

import com.model.Rack;

public interface RackMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Rack record);

    int insertSelective(Rack record);

    Rack selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Rack record);

    int updateByPrimaryKey(Rack record);
}