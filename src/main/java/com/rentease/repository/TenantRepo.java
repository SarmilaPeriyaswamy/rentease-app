package com.rentease.repository;

import com.rentease.entity.Tenant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepo extends CrudRepository<Tenant,Long> {
}
