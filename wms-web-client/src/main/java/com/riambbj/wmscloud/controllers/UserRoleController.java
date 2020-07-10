package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.UserRoleService;
import entity.UserRole;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserRoleController {
    UserRoleService us = new UserRoleService();

    @RequestMapping(value = "userRole/insertUserRole")
    @ResponseBody
    public String insertuserRole(@RequestBody UserRole userRole){
        try {
            us.insertUserRoleInfo(userRole);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/userRole/deleteUserRoleByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteuserRoleById(@RequestParam(value = "id") long id) {
        try {
            // System.out.println(id);
            us.deleteUserRoleById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    //更新用户信息 需要有id号
    @PostMapping(value = "/userRole/updateUserRoleInfo")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public String updateUserInfo(@RequestBody UserRole role) {
        try {
            us.updateUserRoleInfo(role);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }

    @RequestMapping(value = "/userRole/selectById", method = RequestMethod.GET)
    @ResponseBody
    public List<UserRole> selectUserRoleByid(@RequestParam(value = "id") long id) {
        try {
            List<UserRole> list = us.selectUserRoleById(id);
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(value = "/userRole/selectByUserCode", method = RequestMethod.GET)
    @ResponseBody
    public List<UserRole> selectUserRoleByUserCode(@RequestParam(value = "userCode") String userCode) {
        try {
            List<UserRole> list = us.selectUserRoleByUserCode(userCode);
            return list;
        } catch (Exception e) {
            return null;
        }
    }
//
//    @RequestMapping(value = "/userRole/selectByUserCode/{currPage}/{pageSize}", method = RequestMethod.GET)
//    @ResponseBody
//    public List<UserRole> selectUserRoleByUserCode(@RequestParam(value = "userCode") String userCode,@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
//        try {
//            List<UserRole> list = us.selectUserRoleByUserCode(userCode,currPage,pageSize);
//            return list;
//        } catch (Exception e) {
//            return null;
//        }
//    }

}

