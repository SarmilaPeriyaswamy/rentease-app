package com.rentease.controller;

import com.rentease.serviceImpl.AllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllocationController {

    @Autowired
    AllocationService allocationService;

    @GetMapping("/allocation")
    public String test(){
        return "hii";
    }
}
