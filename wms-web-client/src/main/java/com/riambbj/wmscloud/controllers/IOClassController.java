package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.IOClassService;
import entity.IOClass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IOClassController {
    IOClassService us = new IOClassService();

    @RequestMapping(value = "ioClass/insertIOClass")
    @ResponseBody
    public String insertIOClass(@RequestBody IOClass ioClass){
        try {
            us.insertService(ioClass);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/ioClass/deleteIOClassByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteIOClassById(@RequestParam(value = "id") int id) {
        try {
            // System.out.println(id);
            us.deleteService(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/ioClass/updateIOClassInfo")
    @ResponseBody
    public String updateIOClassInfo(@RequestBody IOClass ioClass) {
        try {
            us.updateService(ioClass);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/ioClass/selectById", method = RequestMethod.GET)
    @ResponseBody
    public IOClass selectIOClassByid(@RequestParam(value = "id") int id) {
        try {
            IOClass ioClass = us.selectByIdService(id);
            return ioClass;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/ioClass/selectByMore")
    @ResponseBody
    public List<IOClass> selectByMore(@RequestBody IOClass ioClass) {
        try {
            List<IOClass> result = us.selectByMore(ioClass);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @PostMapping(value = "/ioClass/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<IOClass> selectByMore(@RequestBody IOClass ioClass,@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<IOClass> result = us.selectByMore(ioClass,currPage,pageSize);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
