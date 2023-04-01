package com.vverba.economic.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "license")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class License extends AbstractEntity {

    @Column
    private String name;
    @Column
    private Double cost;
    @Enumerated(EnumType.STRING)
    private Currency currency;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
