package com.riambbj.wmscloud.services;

import dao.MatdetDao;
import entity.Matdet;
import entity.RackSum;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class MatdetService {
    @Autowired
    MatdetDao dao = new MatdetDao();

    public int insertMatdetInfo(Matdet matdet){
        return dao.add(matdet);
    }

    public int deleteMatdetById(long id){
        return dao.delete(id);
    }

    public int updateMatdetInfo(Matdet matdet){
        return dao.update(matdet);
    }

    public Matdet selectMatdetByid(long id){
        return dao.get(id);
    }

    public List<Matdet> selectMatdetList(){
        return dao.list();
    }

    public List<Matdet> selectByMore(Matdet log,int currPage, int pageSize){
        List<Matdet> list = dao.selectByMore(log);
        int firstIndex= (currPage-1)*pageSize;
        int lastIndex=currPage*pageSize;
        if (list.size()>=lastIndex ) {
            return list.subList(firstIndex, lastIndex);
        }else if( currPage==1){
            return  list;
        }else {
            return null;
        }
    }

    public List<RackSum> selectByStatus(int companyid, Date ltime){return dao.selectByStatus(companyid,ltime);}
}
