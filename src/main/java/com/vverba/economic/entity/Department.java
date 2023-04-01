package com.vverba.economic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "department")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Department extends AbstractEntity {

    @Column
    private String name;
}
