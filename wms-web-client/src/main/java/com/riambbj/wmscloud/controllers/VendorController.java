package com.riambbj.wmscloud.controllers;

import com.riambbj.wmscloud.services.VendorService;
import entity.Vendor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class VendorController {
    VendorService us = new VendorService();

    @RequestMapping(value = "vendor/insertVendor")
    @ResponseBody
    public String insertVendor(@RequestBody Vendor vendor){
        try {
            us.insertVendorInfo(vendor);
            return "TRUE";
        }catch (Exception e){
            return "FALSE";
        }
    }

    @RequestMapping(value = "/vendor/deleteVendorByid", method = RequestMethod.GET)
    @ResponseBody
    public String deleteVendorById(@RequestParam(value = "id") long id) {
        try {
            // System.out.println(id);
            us.deleteVendorById(id);
            return "TRUE";
        } catch (Exception e) {
            return "FALSE";
        }
    }

    @PostMapping(value = "/vendor/updateVendorInfo")
    @ResponseBody
    public String updateVendorInfo(@RequestBody Vendor vendor) {
        try {
            us.updateVendorInfo(vendor);
            return "TRUE";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "FALSE";
        }
    }

    @RequestMapping(value = "/vendor/selectAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Vendor> selectVendorList() throws Exception {

        try {
            return us.selectVendorList();

        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping(value = "/vendor/selectById", method = RequestMethod.GET)
    @ResponseBody
    public Vendor selectVendorByid(@RequestParam(value = "id") long id) {
        try {
            Vendor vendor = us.selectVendorByid(id);
            return vendor;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping(value = "/vendor/selectByMore")
    @ResponseBody
    public List<Vendor> selectByMore(@RequestBody Vendor vendor) {
        try {
           List<Vendor> list = us.selectByMore(vendor);
            return list;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @PostMapping(value = "/vendor/selectByMore/{currPage}/{pageSize}")
    @ResponseBody
    public List<Vendor> selectByMore(@RequestBody Vendor vendor,@PathVariable("currPage") int currPage, @PathVariable("pageSize") int pageSize) {
        try {
            List<Vendor> list = us.selectByMore(vendor,currPage,pageSize);
            return list;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
