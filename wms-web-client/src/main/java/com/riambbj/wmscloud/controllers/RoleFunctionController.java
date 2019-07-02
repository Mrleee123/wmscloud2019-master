package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.RoleFunctionService;
import entity.RoleFunction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@RestController  :controller里面的方法都以Json格式输出
//@RequestParam 用在方法的参数前面 @RequestParam String a =request.getParameter("a")
// @ResponseBody：
//表示该方法的返回结果直接写入HTTP response body中
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



    @PostMapping(value = "/roleFunction/addRole")
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
       }catch (Exception e){
           return "FALSE";
       }
    }

    //更新用户信息 需要有id号
    @PostMapping(value = "/roleFunction/updateRoleInfo")
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
    public String deleteUser(@RequestParam(value = "id") int id) {
        try {
            // System.out.println(id);
            us.deleteRoleFunction(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
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



