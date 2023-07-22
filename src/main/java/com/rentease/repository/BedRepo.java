package com.rentease.repository;

import com.rentease.entity.Bed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedRepo extends CrudRepository<Bed,Long> {
}
