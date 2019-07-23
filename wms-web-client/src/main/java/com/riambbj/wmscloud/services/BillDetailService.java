package com.riambbj.wmscloud.services;

import dao.BillDetailDao;
import entity.BillDetail;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BillDetailService {
    @Autowired
    BillDetailDao dao = new BillDetailDao();

    public int insertService(BillDetail billDetail){return dao.add(billDetail);}

    public int deleteService(int id){return dao.delete(id);}

    public int updateService(BillDetail billDetail){return dao.update(billDetail);}

    public BillDetail selectByIdService(int id){return dao.get(id);}

    public List<BillDetail> selectByMore(BillDetail billDetail){return dao.selectByMore(billDetail);}
}
