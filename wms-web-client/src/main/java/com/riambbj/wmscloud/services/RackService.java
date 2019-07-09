package com.riambbj.wmscloud.services;

import dao.RackDao;
import entity.Rack;

import java.util.List;

public class RackService {
    RackDao dao = new RackDao();

    public int insertService(Rack rack){
        return dao.add(rack);
    }

    public int deleteService(long id){
        return dao.delete(id);
    }

    public int updateService(Rack rack){
        return dao.update(rack);
    }

    public Rack selectByIdService(long id){
        return dao.get(id);
    }

    public List<Rack> selectByMoreService(Rack rack){
        return dao.selectByMore(rack);
    }
}
