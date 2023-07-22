package com.rentease.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class Tenant {
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private long id;
//    @OneToOne
//    private Login login;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String addressNumber;
    private String occupation;
    private String joiningDate;
}
