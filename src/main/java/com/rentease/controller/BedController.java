package com.rentease.controller;

import com.rentease.serviceImpl.AllocationService;
import com.rentease.serviceImpl.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BedController {

    @Autowired
    BedService bedService;

    @GetMapping("/bed")
    public void test(){

    }
}
