package com.dao;

import com.model.WorkFlow;

public interface WorkFlowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WorkFlow record);

    int insertSelective(WorkFlow record);

    WorkFlow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WorkFlow record);

    int updateByPrimaryKey(WorkFlow record);
}