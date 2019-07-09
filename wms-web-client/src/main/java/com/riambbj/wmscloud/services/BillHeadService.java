package com.riambbj.wmscloud.services;

import dao.BillHeadDao;
import entity.BillHead;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BillHeadService {
    @Autowired
    BillHeadDao dao = new BillHeadDao();

    public int insertService(BillHead billHead){return dao.add(billHead);}

    public int deleteService(int id){return dao.delete(id);}

    public int updateService(BillHead billHead){return dao.update(billHead);}

    public BillHead selectByIdService(int id){return dao.get(id);}

    public List<BillHead> selectByMore(BillHead billHead){return dao.selectByMore(billHead);}
}
