package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class WarehousingManager {
    ManagerService us = new ManagerService();

    @RequestMapping(value = "WarehousingManager/selectTotalNumber", method = RequestMethod.GET)
    @ResponseBody
    public Map selectTotalNumber(@RequestParam (value = "companyid") int companyid){
        Map<Integer, Integer> map = new HashMap<>();
        map = us.selectTotalNumberServiceByCompany(companyid);
        return map;
    }
}
