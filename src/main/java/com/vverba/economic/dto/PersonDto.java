package com.vverba.economic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.vverba.economic.entity.Person} entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto extends AbstractDto implements Serializable {

    private String firstname;
    private String lastname;
}