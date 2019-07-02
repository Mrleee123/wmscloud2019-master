package com.dao;

import com.model.ZuHu;

public interface ZuHuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZuHu record);

    int insertSelective(ZuHu record);

    ZuHu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZuHu record);

    int updateByPrimaryKey(ZuHu record);
}