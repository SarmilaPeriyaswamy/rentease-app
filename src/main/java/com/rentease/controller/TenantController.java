package com.rentease.controller;

import com.rentease.entity.Login;
import com.rentease.entity.Tenant;
import com.rentease.serviceImpl.AllocationService;
import com.rentease.serviceImpl.TenantService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@RestController
public class TenantController {

    @Autowired
    TenantService tenantService;

    @GetMapping("/tenant/{id}")
    public Tenant getTenant(@RequestParam Long id){
        return tenantService.getById(id);
    }

    @GetMapping("/tenants")
    public List<Tenant> getAllTenants(){
        return tenantService.getAllTenants();
    }

    @PostMapping("/tenant/create")
    public Tenant createNewTenant(@RequestBody Tenant tenant){
        return tenantService.create(tenant);
    }

    @PutMapping("/tenant/update")
    public Tenant updateNewTenant(@RequestBody Tenant tenant){
        return tenantService.update(tenant);
    }

    @DeleteMapping("/tenant/delete/{id}")
    public void deleteTenant(@RequestParam Long id){
        tenantService.deleteById(id);
    }
}
