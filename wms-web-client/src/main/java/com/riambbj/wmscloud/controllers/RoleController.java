package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.RoleService;
import entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@RestController  :controller里面的方法都以Json格式输出
//@RequestParam 用在方法的参数前面 @RequestParam String a =request.getParameter("a")
// @ResponseBody：
//表示该方法的返回结果直接写入HTTP response body中
@Controller
public class RoleController {
    // @Autto
    RoleService us = new RoleService();

    //查询所有用户   @ResponseBody 使返回的不是链接
    @RequestMapping(value = "/role/selectAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Role> getUser() throws Exception {

        try {
            return us.getRoleList();

        } catch (Exception e) {
            return null;
        }


    }

    //根据id查询用户
    @RequestMapping(value = "/role/selectById", method = RequestMethod.GET)
    @ResponseBody
    public Role getUserByid(@RequestParam(value = "id") int id) {
        try {
            Role role = us.getRoleById(id);

            return role;
        } catch (Exception e) {
            return null;
        }
    }



    @PostMapping(value = "/role/addRole")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public String addRole(@RequestBody Role role) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
       try {
           us.inserRoleInfo(role);
           return "TRUE";
       }catch (Exception e){
           return "FALSE";
       }
    }

    //更新用户信息 需要有id号
    @PostMapping(value = "/role/updateRoleInfo")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public String updateUserInfo(@RequestBody Role role) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
        try {
            us.updateRoleInfo(role);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }

    //删除用户
    @RequestMapping(value = "/role/deleteRole", method = RequestMethod.GET)
    @ResponseBody
    public String deleteUser(@RequestParam(value = "id") int id) {
        try {
            // System.out.println(id);
            us.deleteRole(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    //禁用用户
    @RequestMapping(value = "/role/forbiddenRole", method = RequestMethod.GET)
    @ResponseBody
    public String forbiddenUser(@RequestParam(value = "id") int id) {
        try {
            us.forbiddenRoleById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    //启用用户
    @RequestMapping(value = "/role/enableRole", method = RequestMethod.GET)
    @ResponseBody
    public String enableUser(@RequestParam(value = "id") int id) {
        try {
            us.enableRoleById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/role/selectByMore")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public List<Role> selectByMore(@RequestBody Role role) {

        try {
            List<Role> result =us.selectByMore(role);
            return result;
        }catch (Exception e){
            return null;
        }
    }

    @PostMapping(value = "/role/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public List<Role> selectByMore(@RequestBody Role role,@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
        try {
            List<Role> result = us.selectByMore(role,currPage,pageSize);
            return result;
        }catch (Exception e){
            return null;
        }
    }
}



