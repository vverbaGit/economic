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
@Table(name = "person")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person extends AbstractEntity {

    @Column
    private String firstname;
    @Column
    private String lastname;

}
