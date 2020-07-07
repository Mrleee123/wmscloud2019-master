package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.ProjectService;
import entity.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProjectController {
    ProjectService us = new ProjectService();

    @RequestMapping(value = "Project/insertProject")
    @ResponseBody
    public String insertProject(@RequestBody Project Project){
        try {
            us.insertProjectInfo(Project);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/Project/deleteProjectByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteProjectById(@RequestParam(value = "id") long id) {
        try {
            // System.out.println(id);
            us.deleteProjectById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/Project/updateProjectInfo")
    @ResponseBody
    public String updateProjectInfo(@RequestBody Project Project) {
        try {
            us.updateProjectInfo(Project);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/Project/selectById", method = RequestMethod.GET)
    @ResponseBody
    public Project selectProjectByid(@RequestParam(value = "id") long id) {
        try {
            Project Project = us.selectProjectByid(id);
            return Project;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/Project/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<Project> selectByMore(@RequestBody Project Project, @PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<Project> result = us.selectByMore(Project,currPage,pageSize);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}


