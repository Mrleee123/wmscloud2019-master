package com.dao;

import com.model.Storedef;

public interface StoredefMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Storedef record);

    int insertSelective(Storedef record);

    Storedef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Storedef record);

    int updateByPrimaryKey(Storedef record);
}