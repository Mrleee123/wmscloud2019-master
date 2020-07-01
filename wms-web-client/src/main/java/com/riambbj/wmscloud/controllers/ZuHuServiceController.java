package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.ZuHuServiceService;
import entity.ZuHuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ZuHuServiceController {
    ZuHuServiceService us = new ZuHuServiceService();

    @RequestMapping(value = "ZuHuService/insertZuHuService")
    @ResponseBody
    public String insertZuHuService(@RequestBody ZuHuService ZuHuService){
        try {
            us.insertZuHuServiceInfo(ZuHuService);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/ZuHuService/deleteZuHuServiceByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteZuHuServiceById(@RequestParam(value = "id") int id) {
        try {
            // System.out.println(id);
            us.deleteZuHuServiceById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/ZuHuService/updateZuHuServiceInfo")
    @ResponseBody
    public String updateZuHuServiceInfo(@RequestBody ZuHuService ZuHuService) {
        try {
            us.updateZuHuServiceInfo(ZuHuService);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/ZuHuService/selectById", method = RequestMethod.GET)
    @ResponseBody
    public ZuHuService selectZuHuServiceByid(@RequestParam(value = "id") int id) {
        try {
            ZuHuService ZuHuService = us.selectZuHuServiceByid(id);
            return ZuHuService;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/ZuHuService/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<ZuHuService> selectByMore(@RequestBody ZuHuService ZuHuService, @PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<ZuHuService> result = us.selectByMore(ZuHuService,currPage,pageSize);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
