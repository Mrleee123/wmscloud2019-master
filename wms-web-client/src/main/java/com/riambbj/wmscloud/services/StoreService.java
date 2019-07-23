package com.riambbj.wmscloud.services;

import dao.StoreDao;
import entity.Store;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StoreService {
    @Autowired
    StoreDao dao = new StoreDao();

    public int insertService(Store store){return dao.add(store);}

    public int deleteService(int id){return dao.delete(id);}

    public int updateService(Store store){return dao.update(store);}

    public Store selectByIdService(int id){return dao.get(id);}

    public List<Store> selectByMore(Store store){return dao.selectByMore(store);}
}
