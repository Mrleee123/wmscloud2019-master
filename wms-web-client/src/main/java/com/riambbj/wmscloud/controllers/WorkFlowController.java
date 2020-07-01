package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.WorkFlowService;
import entity.WorkFlow;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WorkFlowController {
    WorkFlowService us = new WorkFlowService();

    @RequestMapping(value = "WorkFlow/insertWorkFlow")
    @ResponseBody
    public String insertWorkFlow(@RequestBody WorkFlow WorkFlow){
        try {
            us.insertWorkFlowInfo(WorkFlow);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/WorkFlow/deleteWorkFlowByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteWorkFlowById(@RequestParam(value = "id") long id) {
        try {
            // System.out.println(id);
            us.deleteWorkFlowById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/WorkFlow/updateWorkFlowInfo")
    @ResponseBody
    public String updateWorkFlowInfo(@RequestBody WorkFlow WorkFlow) {
        try {
            us.updateWorkFlowInfo(WorkFlow);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/WorkFlow/selectById", method = RequestMethod.GET)
    @ResponseBody
    public WorkFlow selectWorkFlowByid(@RequestParam(value = "id") long id) {
        try {
            WorkFlow WorkFlow = us.selectWorkFlowByid(id);
            return WorkFlow;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/WorkFlow/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<WorkFlow> selectByMore(@RequestBody WorkFlow WorkFlow, @PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<WorkFlow> result = us.selectByMore(WorkFlow,currPage,pageSize);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
