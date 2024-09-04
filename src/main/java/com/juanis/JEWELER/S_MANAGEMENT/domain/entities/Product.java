package com.juanis.JEWELER.S_MANAGEMENT.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "prods")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private boolean status;

    @OneToMany
    private List<Media> media;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Category category;
}
