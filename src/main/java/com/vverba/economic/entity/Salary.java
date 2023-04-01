package com.vverba.economic.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "salary")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Salary extends AbstractEntity {

    @Column
    private Double sum;
    @Column
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private Currency currency;
}
