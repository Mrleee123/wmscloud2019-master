package com.riambbj.wmscloud.services;

import dao.WorkFlowDao;
import entity.WorkFlow;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WorkFlowService {
    @Autowired
    WorkFlowDao dao = new WorkFlowDao();

    public int insertWorkFlowInfo(WorkFlow WorkFlow){
        return dao.add(WorkFlow);
    }

    public int deleteWorkFlowById(long id){
        return dao.delete(id);
    }

    public int updateWorkFlowInfo(WorkFlow WorkFlow){
        return dao.update(WorkFlow);
    }

    public WorkFlow selectWorkFlowByid(long id){
        return dao.get(id);
    }



    public List<WorkFlow> selectByMore(WorkFlow WorkFlow, int currPage, int pageSize){
        List<WorkFlow> list = dao.selectByMore(WorkFlow);
        int firstIndex= (currPage-1)*pageSize;
        int lastIndex=currPage*pageSize;
        return list.subList(firstIndex,lastIndex);}
}
