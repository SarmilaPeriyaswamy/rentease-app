package com.rentease.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Allocation {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private long id;
    @OneToOne
    private Login login;
    @OneToOne
    private Bed bed;
}
