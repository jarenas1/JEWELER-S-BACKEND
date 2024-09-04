package com.juanis.JEWELER.S_MANAGEMENT.domain.entities;

import com.juanis.JEWELER.S_MANAGEMENT.utils.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private String name;

    @Column(nullable = false, length = 15)
    private String email;

    @Column(nullable = false, length = 15)
    private String password;

    @Column(nullable = false, length = 15)
    private Role role;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Review> reviews;

}
