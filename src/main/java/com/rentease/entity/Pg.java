package com.rentease.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pg {
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
}
