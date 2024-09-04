package com.juanis.JEWELER.S_MANAGEMENT.domain.entities;

import com.juanis.JEWELER.S_MANAGEMENT.utils.enums.StatusOrder;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double total;

    @Column(nullable = false)
    private StatusOrder status;

    @Column(nullable = false)
    private Long user;

}
