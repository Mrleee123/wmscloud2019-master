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

}
