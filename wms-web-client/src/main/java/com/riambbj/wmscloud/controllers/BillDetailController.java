package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.BillDetailService;
import entity.BillDetail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BillDetailController {
    BillDetailService us = new BillDetailService();

    @RequestMapping(value = "billDetail/insertBillDetail")
    @ResponseBody
    public String insertBillDetail(@RequestBody BillDetail billDetail){
        try {
            us.insertService(billDetail);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/billDetail/deleteBillDetailByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteBillDetailById(@RequestParam(value = "id") int id) {
        try {
            // System.out.println(id);
            us.deleteService(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/billDetail/updateBillDetailInfo")
    @ResponseBody
    public String updateBillDetailInfo(@RequestBody BillDetail billDetail) {
        try {
            us.updateService(billDetail);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }


    @RequestMapping(value = "/billDetail/selectById", method = RequestMethod.GET)
    @ResponseBody
    public BillDetail selectBillDetailByid(@RequestParam(value = "id") int id) {
        try {
            BillDetail billDetail = us.selectByIdService(id);
            return billDetail;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/billDetail/selectByMore")
    @ResponseBody
    public List<BillDetail> selectByMore(@RequestBody BillDetail billDetail) {
        try {
            List<BillDetail> result = us.selectByMore(billDetail);
            return result;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
