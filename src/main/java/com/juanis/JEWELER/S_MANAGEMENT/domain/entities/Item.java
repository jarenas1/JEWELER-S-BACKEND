package com.juanis.JEWELER.S_MANAGEMENT.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item extends AuditableEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long product;

    @Column(nullable = false)
    private Long order;

    @Column(nullable = false)
    private Integer quantity;
}
