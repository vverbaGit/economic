package com.vverba.economic.dto;

import com.vverba.economic.entity.Currency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.vverba.economic.entity.License} entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LicenseDto extends AbstractDto implements Serializable {

    private String name;
    private Double cost;
    private Currency currency;
    private DepartmentDto department;
}