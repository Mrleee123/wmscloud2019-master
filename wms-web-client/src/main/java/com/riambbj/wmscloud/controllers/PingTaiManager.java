package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.ManagerService;
import com.riambbj.wmscloud.services.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PingTaiManager {
    ManagerService us = new ManagerService();

    ProjectService projectService = new ProjectService();

    @RequestMapping(value = "PingRaiManager/selectTotalNumber", method = RequestMethod.GET)
    @ResponseBody
    public Map selectTotalNumber(){
            Map<Integer, Integer> map = new HashMap<>();
            map = us.selectTotalNumberService();
            return map;

    }

    @RequestMapping(value = "PingRaiManager/selectAddress", method = RequestMethod.GET)
    @ResponseBody
    public List<Map> selectAddress(){
        List<Map> maps = projectService.selectAddress();
        return maps;

    }

}
