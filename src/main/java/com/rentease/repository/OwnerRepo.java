package com.rentease.repository;

import com.rentease.entity.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepo extends CrudRepository<Owner,Long> {
}
