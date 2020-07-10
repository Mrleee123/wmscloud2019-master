package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.DevLogService;
import entity.DevLog;
import entity.RackSum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @PostMapping(value = "/devLog/selectMore")
    @ResponseBody
    public List<DevLog> selectMore(@RequestBody DevLog devLog) {
        try {
            List<DevLog> result = us.selectMore(devLog);
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

    @RequestMapping(value = "/devLog/selectByDevAndCompany", method = RequestMethod.GET)
    @ResponseBody
    public List<Map> selectByDevAndCompany(@RequestParam(value = "devno") String devno,@RequestParam(value = "companyid") Integer comapnyid ) {
        try {
            List<Map> maps = us.selectByDevAndCompany(devno,comapnyid) ;
            return maps;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @RequestMapping(value = "/devLog/selectByStatus", method = RequestMethod.GET)
    @ResponseBody
    public List<RackSum> selectByStatus(@RequestParam(value = "companyid") int companyid, @RequestParam(value = "ltime") String  ltime) {
        try {
            DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
            Date date = null;
            date = format1.parse(ltime);
            List<RackSum> rack = us.selectByStatus(companyid,date);
            return rack;
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(value = "/devLog/selectByStatusAll", method = RequestMethod.GET)
    @ResponseBody
    public List<RackSum> selectByStatusAll( @RequestParam(value = "ltime") String  ltime) {
        try {
            DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
            Date date = null;
            date = format1.parse(ltime);
            List<RackSum> rack = us.selectByStatusAll(date);
            return rack;
        } catch (Exception e) {
            return null;
        }
    }
}
