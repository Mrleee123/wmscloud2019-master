package com.riambbj.wmscloud.services;

import dao.VendorDao;
import entity.Vendor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VendorService {
    @Autowired
    VendorDao dao = new VendorDao();
    public int insertVendorInfo(Vendor vendor){
        return dao.add(vendor);
    }

    public int deleteVendorById(long id){
        return dao.delete(id);
    }

    public int updateVendorInfo(Vendor vendor){
        return dao.update(vendor);
    }

    public Vendor selectVendorByid(long id){
        return dao.get(id);
    }

    public List<Vendor> selectVendorList(){
        return dao.list();
    }

    public List<Vendor> selectByMore(Vendor vendor){return dao.selectByMore(vendor);}
}
