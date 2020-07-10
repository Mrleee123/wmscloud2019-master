package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.BillHeadService;
import entity.BillHead;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BillHeadController {
    BillHeadService us = new BillHeadService();

    @RequestMapping(value = "billHead/insertBillHead")
    @ResponseBody
    public String insertBillHead(@RequestBody BillHead billHead){
        try {
            us.insertService(billHead);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/billHead/deleteBillHeadByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteBillHeadById(@RequestParam(value = "id") int id) {
        try {
            // System.out.println(id);
            us.deleteService(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/billHead/updateBillHeadInfo")
    @ResponseBody
    public String updateBillHeadInfo(@RequestBody BillHead billHead) {
        try {
            us.updateService(billHead);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/billHead/selectById", method = RequestMethod.GET)
    @ResponseBody
    public BillHead selectBillHeadByid(@RequestParam(value = "id") int id) {
        try {
            BillHead billHead = us.selectByIdService(id);
            return billHead;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/billHead/selectByMore")
    @ResponseBody
    public List<BillHead> selectByMore(@RequestBody BillHead billHead) {
        try {
            List<BillHead> result = us.selectByMore(billHead);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @PostMapping(value = "/billHead/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<BillHead> selectByMore(@RequestBody BillHead billHead,@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<BillHead> result = us.selectByMore(billHead,currPage,pageSize);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
