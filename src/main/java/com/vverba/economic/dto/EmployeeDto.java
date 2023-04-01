package com.vverba.economic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto extends AbstractDto implements Serializable {

    private PersonDto person;
    private SalaryDto salary;
    private DepartmentDto department;
    private PositionDto position;
    private Double currentSalary;
}