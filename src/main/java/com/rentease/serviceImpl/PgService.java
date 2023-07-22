package com.rentease.serviceImpl;

import com.rentease.repository.PgRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PgService {

    @Autowired
    PgRepo pgRepo;
}
