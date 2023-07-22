package com.rentease.controller;

import com.rentease.serviceImpl.AllocationService;
import com.rentease.serviceImpl.PgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PgController {

    @Autowired
    PgService pgService;

    @GetMapping("/pg")
    public void test(){

    }
}
