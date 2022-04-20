package com.ntd.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;

    @ManyToOne
    private Customer customer;

    @Column(name = "order_date")
//    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime orderDate;

    @Column(name = "`status`", length = 10)
    private String status;
}
