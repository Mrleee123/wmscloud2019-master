package com.riambbj.wmscloud.services;

import dao.ProjectDao;
import dao.UserDao;
import dao.WorkFlowDao;
import dao.ZuHuDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class ManagerService {
    @Autowired
    ZuHuDao zuHuDao = new ZuHuDao();

    @Autowired
    ProjectDao projectDao = new ProjectDao();

    @Autowired
    WorkFlowDao workFlowDao = new WorkFlowDao();

    @Autowired
    UserDao userDao = new UserDao();

    public Map selectTotalNumberService(){

        Map<Integer,Integer> map = new HashMap<>() ;
        map.put(1,zuHuDao.selectTotalNumber());
        map.put(2,projectDao.selectTotalNumber());
        map.put(3,workFlowDao.selectTotalNumber());
        return map;
    }

    public Map selectTotalNumberServiceByCompany(Integer id){

        Map<Integer,Integer> map = new HashMap<>() ;
        map.put(1,zuHuDao.selectDevnumber(id));
        map.put(2,userDao.selectTotalNumber(id));
        map.put(3,workFlowDao.selectTotalNumberByCompany(id));
        return map;
    }
}
