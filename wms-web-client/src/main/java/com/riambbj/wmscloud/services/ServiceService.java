package com.riambbj.wmscloud.services;

import dao.ServiceDao;
import entity.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceService {
    @Autowired
    ServiceDao dao = new ServiceDao();

    public int insertServiceInfo(Service Service){
        return dao.add(Service);
    }

    public int deleteServiceById(long id){
        return dao.delete(id);
    }

    public int updateServiceInfo(Service Service){
        return dao.update(Service);
    }

    public Service selectServiceByid(long id){
        return dao.get(id);
    }



    public List<Service> selectByMore(Service Service, int currPage, int pageSize){
        List<Service> list = dao.selectByMore(Service);
        int firstIndex= (currPage-1)*pageSize;
        int lastIndex=currPage*pageSize;
        return list.subList(firstIndex,lastIndex);}
}

