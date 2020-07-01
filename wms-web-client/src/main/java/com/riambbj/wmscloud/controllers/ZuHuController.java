package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.ZuHuService;
import entity.ZuHu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ZuHuController {
    ZuHuService us = new ZuHuService();

    @RequestMapping(value = "ZuHu/insertZuHu")
    @ResponseBody
    public String insertZuHu(@RequestBody ZuHu ZuHu){
        try {
            us.insertZuHuInfo(ZuHu);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/ZuHu/deleteZuHuByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteZuHuById(@RequestParam(value = "id") int id) {
        try {
            // System.out.println(id);
            us.deleteZuHuById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/ZuHu/updateZuHuInfo")
    @ResponseBody
    public String updateZuHuInfo(@RequestBody ZuHu ZuHu) {
        try {
            us.updateZuHuInfo(ZuHu);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/ZuHu/selectById", method = RequestMethod.GET)
    @ResponseBody
    public ZuHu selectZuHuByid(@RequestParam(value = "id") int id) {
        try {
            ZuHu ZuHu = us.selectZuHuByid(id);
            return ZuHu;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/ZuHu/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<ZuHu> selectByMore(@RequestBody ZuHu ZuHu, @PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<ZuHu> result = us.selectByMore(ZuHu,currPage,pageSize);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}


