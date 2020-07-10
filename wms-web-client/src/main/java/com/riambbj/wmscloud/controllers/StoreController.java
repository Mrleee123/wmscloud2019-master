package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.StoreService;
import entity.Store;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StoreController {
    StoreService us = new StoreService();

    @RequestMapping(value = "store/insertStore")
    @ResponseBody
    public String insertStore(@RequestBody Store store){
        try {
            us.insertService(store);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/store/deleteStoreByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteStoreById(@RequestParam(value = "id") int id) {
        try {
            // System.out.println(id);
            us.deleteService(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/store/updateStoreInfo")
    @ResponseBody
    public String updateStoreInfo(@RequestBody Store store) {
        try {
            us.updateService(store);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/store/selectById", method = RequestMethod.GET)
    @ResponseBody
    public Store selectStoreByid(@RequestParam(value = "id") int id) {
        try {
            Store store = us.selectByIdService(id);
            return store;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/store/selectByMore")
    @ResponseBody
    public List<Store> selectByMore(@RequestBody Store store) {
        try {
            List<Store> result = us.selectByMore(store);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @PostMapping(value = "/store/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<Store> selectByMore(@RequestBody Store store,@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<Store> result = us.selectByMore(store,currPage,pageSize);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
