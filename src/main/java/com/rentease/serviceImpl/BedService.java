package com.rentease.serviceImpl;

import com.rentease.repository.BedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BedService {

    @Autowired
    BedRepo bedRepo;
}
