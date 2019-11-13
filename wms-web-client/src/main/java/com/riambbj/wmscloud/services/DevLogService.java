package com.riambbj.wmscloud.services;

import dao.DveLogDao;
import entity.DevLog;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DevLogService {
    @Autowired
    DveLogDao dao = new DveLogDao();

    public int insertDveLogInfo(DevLog log){
        return dao.add(log);
    }

    public int deleteDveLogById(int id){
        return dao.delete(id);
    }

    public int updateDveLogInfo(DevLog log){
        return dao.update(log);
    }

    public DevLog selectDveLogByid(int id){
        return dao.get(id);
    }



    public List<DevLog> selectByMore(DevLog log, int currPage, int pageSize){
        List<DevLog> list = dao.selectByMore(log);
        int firstIndex= (currPage-1)*pageSize;
        int lastIndex=currPage*pageSize;
        return list.subList(firstIndex,lastIndex);}
}
