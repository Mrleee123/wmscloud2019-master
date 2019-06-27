package com.riambbj.wmscloud.services;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    UserDao dao=new UserDao();
    public List<User> getUserList() throws Exception{
        return dao.list();
    }
}
