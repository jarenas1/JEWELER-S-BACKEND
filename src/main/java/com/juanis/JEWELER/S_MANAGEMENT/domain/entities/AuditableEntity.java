package com.juanis.JEWELER.S_MANAGEMENT.domain.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class AuditableEntity {
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
