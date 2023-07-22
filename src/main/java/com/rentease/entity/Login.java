package com.rentease.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Login {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private Long userId;
    private String userName;
    private String password;
    private Role role;
}
