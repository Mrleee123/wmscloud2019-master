package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.UserService;
import entity.RoleFunction;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


//@RestController  :controller里面的方法都以Json格式输出
//@RequestParam 用在方法的参数前面 @RequestParam String a =request.getParameter("a")
// @ResponseBody：
//表示该方法的返回结果直接写入HTTP response body中
@Controller
public class UserController {
    // @Autto
    UserService us = new UserService();

    //查询所有用户   @ResponseBody 使返回的不是链接
    @RequestMapping(value = "/user/selectUserAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUser() throws Exception {

        try {
            return us.getUserList();

        } catch (Exception e) {
            return null;
        }


    }

    //根据id查询用户
    @RequestMapping(value = "/user/selectById", method = RequestMethod.GET)
    @ResponseBody
    public User getUserByid(@RequestParam(value = "id") long id) {
        try {
            User user = us.getUserById(id);
            System.out.println(user.getUserCode() + "   --" + user.getPassword());
            return user;
        } catch (Exception e) {
            return null;
        }
    }

    //根据查询用户
    @RequestMapping(value = "/user/selectByUserCode", method = RequestMethod.GET)
    @ResponseBody
    public User getUserByUserCode(@RequestParam(value = "userCode") String userCode) {
        try {
            User user = us.getUserByUserCode(userCode);
            System.out.println(user.getUserCode() + "   --" + user.getPassword());
            return user;
        } catch (Exception e) {
            return null;
        }
    }

    //用户登录   post
    //在json中参数 userCode userName createTime。。。一点得相同，不然post之后为null
    //返回功能和URL
    @PostMapping(value = "/user/login")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public String login(@RequestBody User user) {
        String user_code = user.getUserCode();
        String password = user.getPassword();
        Integer companyid = user.getCompanyId();
        //System.out.println(user_code + "   1---   " + password);
        if (user_code != null && password != null && companyid!=null) {
            //System.out.println(user_code + "   2---   " + password);
            User result = us.loginUser(user_code, password,companyid);
            // System.out.println(user_code + "   3---   " + password);
            if (result != null) {
                return "1";
            } else {
                return "500";
            }
        } else {
            return "404";
        }
    }

    @PostMapping(value = "/user/register")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public String register(@RequestBody User user) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
       try {
           us.inserUserInfo(user);
           return "TRUE";
       }catch (Exception e){
           return "FALSE";
       }
    }

    @PostMapping(value = "/user/selectByMore")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public List<User> selectByMore(@RequestBody User user) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
        try {
           List<User> result = us.selectByMore(user);
            return result;
        }catch (Exception e){
            return null;
        }
    }

    @PostMapping(value = "/user/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public List<User> selectByMore(@RequestBody User user,@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
        try {
            List<User> result = us.selectByMore(user,currPage,pageSize);
            return result;
        }catch (Exception e){
            return null;
        }
    }

    //更新用户信息 需要有id号
    @PostMapping(value = "/user/updateUserInfo")
    @ResponseBody
    //public String login(@RequestBody String user_code, @RequestBody String password) {
    public String updateUserInfo(@RequestBody User user) {
//        String user_code = user.getUserCode();
//        String password = user.getPassword();
//        long id = user.getId();
//        int issa = user.getIssa();
//        String user_name = user.getUserName();
//        String demo = user.getDemo();
//        int isendable = user.getIsenabled();
//        int isdeleted = user.getIsdeleted();
        try {
            java.sql.Date time = new java.sql.Date(new Date().getTime());
            Date update_time = time;
            user.setUpdateTime(update_time);
            System.out.println(update_time);
            System.out.println(user.getUserCode());
            us.updateUserInfo(user);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }

    //删除用户
    @RequestMapping(value = "/user/deleteUserByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteUser(@RequestParam(value = "id") long id) {
        try {
            // System.out.println(id);
            us.deleteUser(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    //禁用用户
    @RequestMapping(value = "/user/forbiddenUser", method = RequestMethod.GET)
    @ResponseBody
    public String forbiddenUser(@RequestParam(value = "id") long id) {
        try {
            us.forbiddenUserById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    //启用用户
    @RequestMapping(value = "/user/enableUser", method = RequestMethod.GET)
    @ResponseBody
    public String enableUser(@RequestParam(value = "id") long id) {
        try {
            us.enableUserById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @RequestMapping(value = "/user/selectFuctionByUserCode", method = RequestMethod.GET)
    @ResponseBody
    public List<RoleFunction> selectUserRoleByUserCode(@RequestParam(value = "userCode") String userCode) {
        try {

            List<RoleFunction> list = us.selectFuctionByUserCode(userCode);
            return list;
        } catch (Exception e) {
            return null;
        }
    }

}



