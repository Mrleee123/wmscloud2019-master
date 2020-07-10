package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.MatmainService;
import entity.Matmain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MatmainController {
    MatmainService us = new MatmainService();

    @RequestMapping(value = "matmain/insertMatmain")
    @ResponseBody
    public String insertMatmain(@RequestBody Matmain matmain){
        try {
            us.insertMatmainInfo(matmain);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/matmain/deleteMatmainByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteMatmainById(@RequestParam(value = "id") int id) {
        try {
            // System.out.println(id);
            us.deleteMatmainById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/matmain/updateMatmainInfo")
    @ResponseBody
    public String updateMatmainInfo(@RequestBody Matmain matmain) {
        try {
            us.updateMatmainInfo(matmain);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }

    @RequestMapping(value = "/matmain/selectAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Matmain> selectMatmainList() throws Exception {

        try {
            return us.selectMatmainList();

        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(value = "/matmain/selectById", method = RequestMethod.GET)
    @ResponseBody
    public Matmain selectMatmainByid(@RequestParam(value = "id") int id) {
        try {
            Matmain matmain = us.selectMatmainByid(id);
            return matmain;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/matmain/selectByMore")
    @ResponseBody
    public List<Matmain> selectByMore(@RequestBody Matmain matmain) {
        try {
            List<Matmain> result = us.selectByMore(matmain);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @PostMapping(value = "/matmain/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<Matmain> selectByMore(@RequestBody Matmain matmain,@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<Matmain> result = us.selectByMore(matmain,currPage,pageSize);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
