package com.riambbj.wmscloud.services;

import dao.IOClassDao;
import entity.IOClass;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IOClassService {
    @Autowired
    IOClassDao dao = new IOClassDao();

    public int insertService(IOClass ioClass){return dao.add(ioClass);}

    public int deleteService(int id){return dao.delete(id);}

    public int updateService(IOClass ioClass){return dao.update(ioClass);}

    public IOClass selectByIdService(int id){return dao.get(id);}

    public List<IOClass> selectByMore(IOClass ioClass){return dao.selectByMore(ioClass);}

    public List<IOClass> selectByMore(IOClass log,int currPage, int pageSize){
        List<IOClass> list = dao.selectByMore(log);
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
