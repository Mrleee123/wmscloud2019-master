package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.ServiceService;
import entity.Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ServiceController {
    ServiceService us = new ServiceService();

    @RequestMapping(value = "Service/insertService")
    @ResponseBody
    public String insertService(@RequestBody Service Service){
        try {
            us.insertServiceInfo(Service);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/Service/deleteServiceByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteServiceById(@RequestParam(value = "id") long id) {
        try {
            // System.out.println(id);
            us.deleteServiceById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/Service/updateServiceInfo")
    @ResponseBody
    public String updateServiceInfo(@RequestBody Service Service) {
        try {
            us.updateServiceInfo(Service);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/Service/selectById", method = RequestMethod.GET)
    @ResponseBody
    public Service selectServiceByid(@RequestParam(value = "id") long id) {
        try {
            Service Service = us.selectServiceByid(id);
            return Service;
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(value = "/Service/selectByCompanyId", method = RequestMethod.GET)
    @ResponseBody
    public List<Service> selectByCompanyId(@RequestParam(value = "companyid") int companyid) {
        try {
            List<Service> Service = us.selectByCompanyId(companyid);
            return Service;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/Service/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<Service> selectByMore(@RequestBody Service Service, @PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<Service> result = us.selectByMore(Service,currPage,pageSize);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}


