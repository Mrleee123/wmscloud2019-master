package com.riambbj.wmscloud.services;

import dao.ZuHuServiceDao;
import entity.ZuHuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ZuHuServiceService {
    @Autowired
    ZuHuServiceDao dao = new ZuHuServiceDao();

    public int insertZuHuServiceInfo(ZuHuService ZuHuService){
        return dao.add(ZuHuService);
    }

    public int deleteZuHuServiceById(int id){
        return dao.delete(id);
    }

    public int updateZuHuServiceInfo(ZuHuService ZuHuService){
        return dao.update(ZuHuService);
    }

    public ZuHuService selectZuHuServiceByid(int id){
        return dao.get(id);
    }



    public List<ZuHuService> selectByMore(ZuHuService ZuHuService, int currPage, int pageSize){
        List<ZuHuService> list = dao.selectByMore(ZuHuService);
        int firstIndex= (currPage-1)*pageSize;
        int lastIndex=currPage*pageSize;
        return list.subList(firstIndex,lastIndex);}
}
