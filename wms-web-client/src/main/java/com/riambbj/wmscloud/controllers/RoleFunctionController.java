package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.RoleFunctionService;
import entity.RoleFunction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class RoleFunctionController {
    // @Autto
    RoleFunctionService us = new RoleFunctionService();

    //查询所有用户   @ResponseBody 使返回的不是链接
    @RequestMapping(value = "/roleFunction/selectAll", method = RequestMethod.GET)
    @ResponseBody
    public List<RoleFunction> getUser() throws Exception {

        try {
            return us.getRoleFunctionList();

        } catch (Exception e) {
            return null;
        }


    }

    //根据id查询用户
    @RequestMapping(value = "/roleFunction/selectById", method = RequestMethod.GET)
    @ResponseBody
    public RoleFunction getUserByid(@RequestParam(value = "id") int id) {
        try {
            RoleFunction role = us.getRoleFunctionById(id);

            return role;
        } catch (Exception e) {
            return null;
        }
    }


    @PostMapping(value = "/roleFunction/addRoleFunction")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public String addRoleFunction(@RequestBody RoleFunction role) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
        try {
            us.insertRoleFunctionInfo(role);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/roleFunction/addRoleFunctionList")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public String addRoleFunctionList(@RequestBody List<RoleFunction> role) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
        try {
            us.insertList(role);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @RequestMapping(value = "/roleFunction/deleteRoleFunctionList")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public String deleteRoleFunctionList(@RequestBody List<Integer> list) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
        try {
            System.out.println(list);
            us.deleteList(list);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    //更新用户信息 需要有id号
    @PostMapping(value = "/roleFunction/updateRoleFunctionInfo")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public String updateUserInfo(@RequestBody RoleFunction role) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
        try {
            us.updateRoleFunctionInfo(role);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/roleFunction/deleteRoleFunction", method = RequestMethod.GET)
    @ResponseBody
    public String deleteFunction(@RequestParam(value = "id") int id) {
        try {
            // System.out.println(id);
            us.deleteRoleFunction(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/roleFunction/selectByMore")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public List<RoleFunction> selectByMore(@RequestBody RoleFunction roleFunction) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
        try {
            List<RoleFunction> result = us.selectByMore(roleFunction);
            return result;
        } catch (Exception e) {
            return null;
        }
    }

//    @RequestMapping(value = "/role/forbiddenRole", method = RequestMethod.GET)
//    @ResponseBody
//    public String forbiddenUser(@RequestParam(value = "id") int id) {
//        try {
//            us.forbiddenRoleById(id);
//            return "TRUE";
//        } catch (Exception e) {
//            return "FALSE";
//        }
//    }
//
//
//    @RequestMapping(value = "/role/enableRole", method = RequestMethod.GET)
//    @ResponseBody
//    public String enableUser(@RequestParam(value = "id") int id) {
//        try {
//            us.enableRoleById(id);
//            return "TRUE";
//        } catch (Exception e) {
//            return "FALSE";
//        }
//    }
}



