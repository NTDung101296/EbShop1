package com.ntd.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "publisher_name", length = 255)
    private String name;
}
