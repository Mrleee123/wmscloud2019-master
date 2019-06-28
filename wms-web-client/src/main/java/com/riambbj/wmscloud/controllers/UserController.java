package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.UserService;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


//@RestController  :controller里面的方法都以Json格式输出
//@RequestParam 用在方法的参数前面 @RequestParam String a =request.getParameter("a")
// @ResponseBody：
//表示该方法的返回结果直接写入HTTP response body中
@Controller
public class UserController {
    UserService us=new UserService();
    @RequestMapping("/user")
    @ResponseBody
    public List<User> getUser() throws Exception{

        try{
            return us.getUserList();
        }catch (Exception e){
            return null;
        }


    }

    @RequestMapping( "/selectbyid")
    @ResponseBody
    public User login(@RequestParam(value = "id") long id){
        try {
            return us.getUserById(id);
        }catch (Exception e){
            return null;
        }
    }


//    @RequestMapping("/")
//    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String account, Model model) {
//        model.addAttribute("name", account);
//        return "index";
//    }
//
//    @RequestMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//    @RequestMapping("/loginPost")
//    public @ResponseBody Map<String, Object> loginPost(String account, String password, HttpSession session) {
//        Map<String, Object> map = new HashMap<>();
//        if (!"123456".equals(password)) {
//            map.put("success", false);
//            map.put("message", "密码错误");
//            return map;
//        }
//
//        // 设置session
//        session.setAttribute(WebSecurityConfig.SESSION_KEY, account);
//
//        map.put("success", true);
//        map.put("message", "登录成功");
//        return map;
//    }
//
//    @RequestMapping("/logout")
//    public String logout(HttpSession session) {
//        // 移除session
//        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
//        return "redirect:/login";
//    }

}
