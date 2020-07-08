package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PingTaiManager {
    ManagerService us = new ManagerService();

    @RequestMapping(value = "PingRaiManager/selectTotalNumber", method = RequestMethod.GET)
    @ResponseBody
    public Map selectTotalNumber(){
            Map<Integer, Integer> map = new HashMap<>();
            map = us.selectTotalNumberService();
            return map;

    }
}
