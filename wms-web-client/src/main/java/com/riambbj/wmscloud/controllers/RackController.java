package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.RackService;
import entity.Rack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RackController {
    RackService us = new RackService();
    
    @RequestMapping(value = "rack/insertRack")
    @ResponseBody
    public String insertrack(@RequestBody Rack rack){
        try {
            us.insertService(rack);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/rack/deleteRackById", method = RequestMethod.GET)
    @ResponseBody
    public String deleteRackById(@RequestParam(value = "id") long id) {
        try {
            // System.out.println(id);
            us.deleteService(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/rack/updateRackInfo")
    @ResponseBody
    public String updaterackInfo(@RequestBody Rack rack) {
        try {
            us.updateService(rack);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/rack/selectById", method = RequestMethod.GET)
    @ResponseBody
    public Rack selectrackByid(@RequestParam(value = "id") long id) {
        try {
            Rack rack = us.selectByIdService(id);
            return rack;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/rack/selectByMore")
    @ResponseBody
    public List<Rack> selectByMore(@RequestBody Rack rack) {
        try {
            List<Rack> result = us.selectByMoreService(rack);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
