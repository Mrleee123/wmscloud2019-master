package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.MatdetService;
import entity.Matdet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MatdetController {
    MatdetService us = new MatdetService();

    @RequestMapping(value = "matdet/insertmatdet")
    @ResponseBody
    public String insertmatdet(@RequestBody Matdet matdet){
        try {
            us.insertMatdetInfo(matdet);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/matdet/deleteMatdetByid", method = RequestMethod.GET)
    @ResponseBody
    public String deletematdetById(@RequestParam(value = "id") long id) {
        try {
            // System.out.println(id);
            us.deleteMatdetById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/matdet/updateMatdetInfo")
    @ResponseBody
    public String updatematdetInfo(@RequestBody Matdet matdet) {
        try {
            us.updateMatdetInfo(matdet);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }

    @RequestMapping(value = "/matdet/selectAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Matdet> selectmatdetList() throws Exception {

        try {
            return us.selectMatdetList();

        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(value = "/matdet/selectById", method = RequestMethod.GET)
    @ResponseBody
    public Matdet selectmatdetByid(@RequestParam(value = "id") long id) {
        try {
            Matdet matdet = us.selectMatdetByid(id);
            return matdet;
        } catch (Exception e) {
            return null;
        }
    }
}
