package com.riambbj.wmscloud.services;

import dao.MatdetDao;
import entity.Matdet;
import org.springframework.beans.factory.annotation.Autowired;

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

    public List<Matdet> selectByMore(Matdet matdet,int currPage, int pageSize){
        List<Matdet> list = dao.selectByMore(matdet);
        int firstIndex= (currPage-1)*pageSize;
        int lastIndex=currPage*pageSize;
        return list.subList(firstIndex,lastIndex);}
}
