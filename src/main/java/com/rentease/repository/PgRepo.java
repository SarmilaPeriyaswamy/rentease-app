package com.rentease.repository;

import com.rentease.entity.Pg;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PgRepo extends CrudRepository<Pg,Long> {
}
