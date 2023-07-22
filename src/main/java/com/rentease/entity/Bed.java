package com.rentease.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Bed {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private long id;
    private String roomNumber;
    private long pdId;
    private long floor;
    private SharingType sharingType;
    private long rentAmount;
    private String status;
}
