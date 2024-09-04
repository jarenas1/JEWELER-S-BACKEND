package com.juanis.JEWELER.S_MANAGEMENT.domain.entities;

import com.juanis.JEWELER.S_MANAGEMENT.utils.enums.MediaType;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "medias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private MediaType type;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Product product;
}
