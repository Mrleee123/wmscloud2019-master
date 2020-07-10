package com.riambbj.wmscloud.services;

import dao.MatMainDao;
import entity.Matmain;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MatmainService {
    @Autowired
    MatMainDao dao = new MatMainDao();

    public int insertMatmainInfo(Matmain matmain){
        return dao.add(matmain);
    }

    public int deleteMatmainById(int id){
        return dao.delete(id);
    }

    public int updateMatmainInfo(Matmain matmain){
        return dao.update(matmain);
    }

    public Matmain selectMatmainByid(int id){
        return dao.get(id);
    }

    public List<Matmain> selectMatmainList(){
        return dao.list();
    }

    public List<Matmain> selectByMore(Matmain matmain){return dao.selectByMore(matmain);}

    public List<Matmain> selectByMore(Matmain log,int currPage, int pageSize){
        List<Matmain> list = dao.selectByMore(log);
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
}
