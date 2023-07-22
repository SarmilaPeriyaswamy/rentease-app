//package com.rentease.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@Getter
//@Setter
//@Entity
//public class Bill {
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    @Id
//    private long id;
//    @OneToOne
//    private Tenant tenant;
//    private String month;
//    private LocalDateTime rentPaidTime;
//    private long amount;
//    private BillType type;
//}
