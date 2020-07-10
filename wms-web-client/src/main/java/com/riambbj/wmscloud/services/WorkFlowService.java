package com.riambbj.wmscloud.services;

import dao.WorkFlowDao;
import entity.RackSum;
import entity.WorkFlow;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
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
        int firstIndex = (currPage - 1) * pageSize;
        int lastIndex = currPage * pageSize;
        if (list.size() >= lastIndex) {
            return list.subList(firstIndex, lastIndex);
        } else if (currPage == 1) {
            return list;
        } else {
            return null;
        }
    }
    public List<WorkFlow> selectByMore(WorkFlow WorkFlow){
        List<WorkFlow> list = dao.selectByMore(WorkFlow);

        return list;}

    public List<RackSum> selectByStatus(int companyid, Date ltime){return dao.selectByStatus(companyid,ltime);}

    public List<RackSum> selectByStatusAll( Date ltime){return dao.selectByStatusAll(ltime);}
}
