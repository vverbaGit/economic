package com.vverba.economic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.vverba.economic.entity.Position} entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PositionDto extends AbstractDto implements Serializable {

    private String name;
}