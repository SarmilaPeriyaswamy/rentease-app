package com.rentease.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Owner {
    @OneToOne
    private Login login;
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    private String phoneNumber;
    private String email;
    @OneToOne
    private Pg pg;
}
