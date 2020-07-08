package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.DevLogService;
import entity.DevLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class DevLogController {
    DevLogService us = new DevLogService();

    @RequestMapping(value = "devLog/insertdevLog")
    @ResponseBody
    public String insertdevLog(@RequestBody DevLog devLog){
        try {
            us.insertDveLogInfo(devLog);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/devLog/deleteDevLogByid", method = RequestMethod.GET)
    @ResponseBody
    public String deletedevLogById(@RequestParam(value = "id") int id) {
        try {
            // System.out.println(id);
            us.deleteDveLogById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/devLog/updateDevLogInfo")
    @ResponseBody
    public String updatedevLogInfo(@RequestBody DevLog devLog) {
        try {
            us.updateDveLogInfo(devLog);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }



    @RequestMapping(value = "/devLog/selectById", method = RequestMethod.GET)
    @ResponseBody
    public DevLog selectdevLogByid(@RequestParam(value = "id") int id) {
        try {
            DevLog devLog = us.selectDveLogByid(id);
            return devLog;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/devLog/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<DevLog> selectByMore(@RequestBody DevLog devLog,@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<DevLog> result = us.selectByMore(devLog,currPage,pageSize);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @RequestMapping(value = "/devLog/selectByDev", method = RequestMethod.GET)
    @ResponseBody
    public List<Map> selectByDev(@RequestParam(value = "devno") String devno) {
        try {
            List<Map> maps = us.selectByDev(devno) ;
            return maps;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
