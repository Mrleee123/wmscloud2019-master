package com.riambbj.wmscloud.services;

import dao.LogDao;
import entity.Log;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LogService {
    @Autowired
    LogDao dao = new LogDao();

    public int insertLogInfo(Log log){
        return dao.add(log);
    }

    public int deleteLogById(long id){
        return dao.delete(id);
    }

    public int updateLogInfo(Log log){
        return dao.update(log);
    }

    public Log selectLogByid(long id){
        return dao.get(id);
    }



    public List<Log> selectByMore(Log log,int currPage, int pageSize) {
        List<Log> list = dao.selectByMore(log);
        int firstIndex = (currPage - 1) * pageSize;
        int lastIndex = currPage * pageSize;
        if (list.size() >= lastIndex) {
            return list.subList(firstIndex, lastIndex);
        } else if (currPage == 1) {
            return list;
        } else {
            return null;
        }
    }
}
