package com.rentease.controller;

import com.rentease.entity.Login;
import com.rentease.entity.Role;
import com.rentease.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentEaseHomeController {

    @Autowired
    LoginRepo loginRepo;

    @GetMapping("/")
    public String test(){
        Login login=new Login();
        login.setUserName("name");
        login.setUserName("pass");
        login.setRole(Role.OWNER);

        loginRepo.save(login);
        return loginRepo.findAll().toString();

    }
}
