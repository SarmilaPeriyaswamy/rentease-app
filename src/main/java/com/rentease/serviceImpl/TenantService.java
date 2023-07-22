package com.rentease.serviceImpl;

import com.rentease.entity.Tenant;
import com.rentease.repository.TenantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantService {

    @Autowired
    TenantRepo tenantRepo;

    public Tenant create(Tenant tenant) {
        return tenantRepo.save(tenant);
    }

    public Tenant getById(Long id) {
        return tenantRepo.findById(id).get();
    }

    public List<Tenant> getAllTenants() {
        return (List<Tenant>) tenantRepo.findAll();
    }

    public Tenant update(Tenant tenant) {
        return tenantRepo.save(tenant);
    }

    public void deleteById(Long id) {
        tenantRepo.deleteById(id);
    }
}
