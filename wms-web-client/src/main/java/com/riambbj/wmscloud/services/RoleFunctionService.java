package com.riambbj.wmscloud.services;

import dao.RoleFunctionDao;
import dao.UserRoleDao;
import entity.RoleFunction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/*
  服务器，事务控制
*/
public class RoleFunctionService {
    //Spring 自动对对象进行setget方法 注入
    @Autowired
    RoleFunctionDao roleFunctionDao = new RoleFunctionDao();

    @Autowired
    UserRoleDao userRole =  new UserRoleDao();

    public List<RoleFunction> getRoleFunctionList()  {
        return roleFunctionDao.list();
    }

    public RoleFunction getRoleFunctionById(int id) {
        return roleFunctionDao.get(id);
    }

    public int updateRoleFunctionInfo(RoleFunction role) {
        return roleFunctionDao.update(role);
    }

    public int insertRoleFunctionInfo(RoleFunction role) {
        return roleFunctionDao.add(role);
    }

    public int deleteRoleFunction(int id) {
        return roleFunctionDao.delete(id);
    }

    public int deleteList(List list) {
        return roleFunctionDao.deleteList(list);
    }

    public int insertList(List list) {
        return roleFunctionDao.insertList(list);
    }

    public List<RoleFunction> selectByMore(RoleFunction roleFunction){
        return roleFunctionDao.selectByMore(roleFunction);
    }


}
