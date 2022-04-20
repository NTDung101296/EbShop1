package com.ntd.entity;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "`title`", nullable = false, length = 255)
    private String title;

    @Column(name = "unit_price", nullable = false)
    private BigDecimal price;

    @Column(name = "units_in_stock", nullable = false)
    private int unitsInStock;

    @Column(name = "`status`")
    private boolean status;

    @ManyToOne
    private Author author;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Publisher publisher;
}
