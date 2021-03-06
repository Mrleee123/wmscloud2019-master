package com.riambbj.wmscloud.services;

import dao.StoredefDao;
import entity.Storedef;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StoredefService {
    @Autowired
    StoredefDao dao = new StoredefDao();
    public int insertStoredefInfo(Storedef storedef){
        return dao.add(storedef);
    }

    public int deleteStoredefById(long id){
        return dao.delete(id);
    }

    public int updateStoredefInfo(Storedef storedef){
        return dao.update(storedef);
    }

    public Storedef selectStoredefByid(long id){
        return dao.get(id);
    }

    public List<Storedef> selectStoredefList(){
        return dao.list();
    }

    public List<Storedef> selectByMore(Storedef storedef){return  dao.selectByMore(storedef);}

    public List<Storedef> selectByMore(Storedef log,int currPage, int pageSize){
        List<Storedef> list = dao.selectByMore(log);
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
