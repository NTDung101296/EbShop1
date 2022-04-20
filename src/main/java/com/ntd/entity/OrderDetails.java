package com.ntd.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "order_details")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
