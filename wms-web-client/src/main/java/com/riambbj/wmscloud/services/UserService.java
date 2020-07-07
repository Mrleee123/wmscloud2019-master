package com.riambbj.wmscloud.services;

import dao.RoleFunctionDao;
import dao.UserDao;
import dao.UserRoleDao;
import entity.RoleFunction;
import entity.User;
import entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;

/*
  服务器，事务控制
*/
public class UserService {
    @Autowired
    UserDao userdao = new UserDao();

    @Autowired
    UserRoleDao userRoleDao = new UserRoleDao();

    @Autowired
    RoleFunctionDao roleFunctionDao = new RoleFunctionDao();

    public List<User> getUserList() throws Exception {
        return userdao.list();
    }

    //用户登录
    public User loginUser(String user_code, String password,Integer companyid) {

        return userdao.loginByCodeAndPwd(user_code, password,companyid);
    }

    public User getUserById(long id) {
        return userdao.get(id);
    }

    public User getUserByUserCode(String userCode) {
        return userdao.selectByUserCode(userCode);
    }

    public int updateUserInfo(User user) {
        return userdao.update(user);
    }

    public int inserUserInfo(User user) {
        return userdao.add(user);
    }

    public int deleteUser(long id) {
        return userdao.delete(id);
    }

    public int forbiddenUserById(long id) {
        return userdao.forbiddenUser(id);
    }

    public int enableUserById(long id) {
        return userdao.enableUserById(id);
    }

    public List<User> selectByMore(User user){ return userdao.selectByMore(user);}

    //返回功能URL
    public List<RoleFunction> selectFuctionByUserCode(String UserCode){

        List<UserRole> list1 =  userRoleDao.getByUserCode(UserCode);
        System.out.println("1----"+list1.toString());
        List<RoleFunction> list2 = new LinkedList<>();
        for (int i = 0; i < list1.size(); i++) {
            UserRole userRole =   list1.get(i);
            RoleFunction roleFunction = new RoleFunction();
            roleFunction.setRoleCode(userRole.getRoleCode());
            System.out.println("2----"+userRole.getRoleCode());
            list2.addAll( roleFunctionDao.selectByMore(roleFunction));
        }
        return  list2;
    }

}
