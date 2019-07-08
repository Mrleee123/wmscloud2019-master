package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.StoredefService;
import entity.Storedef;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StoredefController {
    StoredefService us = new StoredefService();

    @RequestMapping(value = "storedef/insertStoredef")
    @ResponseBody
    public String insertStoredef(@RequestBody Storedef storedef){
        try {
            us.insertStoredefInfo(storedef);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/storedef/deleteStoredefByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteStoredefById(@RequestParam(value = "id") long id) {
        try {
            // System.out.println(id);
            us.deleteStoredefById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/storedef/updateStoredefInfo")
    @ResponseBody
    public String updateStoredefInfo(@RequestBody Storedef storedef) {
        try {
            us.updateStoredefInfo(storedef);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }

    @RequestMapping(value = "/storedef/selectAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Storedef> selectStoredefList() throws Exception {

        try {
            return us.selectStoredefList();

        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(value = "/storedef/selectById", method = RequestMethod.GET)
    @ResponseBody
    public Storedef selectStoredefByid(@RequestParam(value = "id") long id) {
        try {
            Storedef storedef = us.selectStoredefByid(id);
            return storedef;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/storedef/selectByMore")
    @ResponseBody
    public List<Storedef> selectByMore(@RequestBody Storedef storedef) {
        try {
           List<Storedef> result = us.selectByMore(storedef);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}

