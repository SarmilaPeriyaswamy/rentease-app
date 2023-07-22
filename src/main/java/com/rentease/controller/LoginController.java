package com.rentease.controller;

import com.rentease.serviceImpl.AllocationService;
import com.rentease.serviceImpl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public void test(){

    }
}
