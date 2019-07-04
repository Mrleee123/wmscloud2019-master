package com.riambbj.wmscloud.services;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/*
  服务器，事务控制
*/
public class UserService {
    @Autowired
    UserDao userdao = new UserDao();

    public List<User> getUserList() throws Exception {
        return userdao.list();
    }

    public User loginUser(String user_code, String password) {
        return userdao.loginByCodeAndPwd(user_code, password);
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


}
