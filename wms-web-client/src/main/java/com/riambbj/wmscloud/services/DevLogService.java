package com.riambbj.wmscloud.services;

import dao.DveLogDao;
import entity.DevLog;
import entity.RackSum;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

    public List<DevLog> selectMore(DevLog log){
        List<DevLog> list = dao.selectByMore(log);
        return list;
    }

    public  List<Map> selectByDev(String Devno){
        List<Map> maps =  dao.selectByDev(Devno);
        return maps;
    }

    public  List<Map> selectByDevAndCompany(String Devno,Integer companyid){
        List<Map> maps =  dao.selectByDevAndCompany(Devno,companyid);
        return maps;
    }

    public List<RackSum> selectByStatus(int companyid, Date ltime){return dao.selectByStatus(companyid,ltime);}

    public List<RackSum> selectByStatusAll( Date ltime){return dao.selectByStatusAll(ltime);}
}
