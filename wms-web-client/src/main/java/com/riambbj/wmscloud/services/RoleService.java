package com.riambbj.wmscloud.services;

import dao.RoleDao;

import entity.Role;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/*
  服务器，事务控制
*/
public class RoleService {
    @Autowired
    RoleDao roledao = new RoleDao();

    public List<Role> getRoleList() throws Exception {
        return roledao.list();
    }

    public Role getRoleById(int id) {
        return roledao.get(id);
    }

    public int updateRoleInfo(Role role) {
        return roledao.update(role);
    }

    public int inserRoleInfo(Role role) {
        return roledao.add(role);
    }

    public int deleteRole(int id) {
        return roledao.delete(id);
    }

    public int forbiddenRoleById(int id){
        return roledao.forbiddenRoleById(id);
    }

    public int enableRoleById(int id){
        return roledao.enableRoleById(id);
    }

    public List<Role> selectByMore(Role role){return roledao.selectByMore(role);}

    public List<Role> selectByMore(Role log,int currPage, int pageSize){
        List<Role> list = roledao.selectByMore(log);
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
