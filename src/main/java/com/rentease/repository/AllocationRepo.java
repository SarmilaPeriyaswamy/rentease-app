package com.rentease.repository;

import com.rentease.entity.Allocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationRepo extends CrudRepository<Allocation,Long> {
}
