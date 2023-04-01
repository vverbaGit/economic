package com.vverba.economic.dto;

import com.vverba.economic.entity.Currency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

/**
 * A DTO for the {@link com.vverba.economic.entity.Salary} entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalaryDto extends AbstractDto implements Serializable {

    private Double sum;
    private LocalDate date;
    private Currency currency;
}