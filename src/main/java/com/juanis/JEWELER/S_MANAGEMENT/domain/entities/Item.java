package com.juanis.JEWELER.S_MANAGEMENT.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "aitems")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item extends AuditableEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn (nullable = false)
    private Order order;

    @Column(nullable = false)
    private Integer quantity;
}
