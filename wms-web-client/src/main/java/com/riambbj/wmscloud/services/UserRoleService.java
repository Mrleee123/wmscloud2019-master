package com.riambbj.wmscloud.services;

import dao.UserRoleDao;
import entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserRoleService {
    @Autowired
    UserRoleDao dao = new UserRoleDao();

    public int insertUserRoleInfo(UserRole matdet){
        return dao.add(matdet);
    }

    public int deleteUserRoleById(long id){
        return dao.delete(id);
    }

    public int updateUserRoleInfo(UserRole matdet){
        return dao.update(matdet);
    }

    public List<UserRole> selectUserRoleById(long id){
        return dao.get(id);
    }

    public List<UserRole> selectUserRoleByUserCode(String userCode){
        return dao.getByUserCode(userCode);
    }
}
