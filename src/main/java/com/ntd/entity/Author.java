package com.ntd.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "author_name", nullable = false, length = 255)
    private String name;
}
