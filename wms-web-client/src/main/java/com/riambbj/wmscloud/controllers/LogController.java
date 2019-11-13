package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.LogService;
import entity.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LogController {
    LogService us = new LogService();

    @RequestMapping(value = "log/insertlog")
    @ResponseBody
    public String insertlog(@RequestBody Log log){
        try {
            us.insertLogInfo(log);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/log/deleteLogByid", method = RequestMethod.GET)
    @ResponseBody
    public String deletelogById(@RequestParam(value = "id") long id) {
        try {
            // System.out.println(id);
            us.deleteLogById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/log/updateLogInfo")
    @ResponseBody
    public String updatelogInfo(@RequestBody Log log) {
        try {
            us.updateLogInfo(log);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/log/selectById", method = RequestMethod.GET)
    @ResponseBody
    public Log selectlogByid(@RequestParam(value = "id") long id) {
        try {
            Log log = us.selectLogByid(id);
            return log;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/log/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<Log> selectByMore(@RequestBody Log log,@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<Log> result = us.selectByMore(log,currPage,pageSize);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}


