package com.vverba.economic.mapper;

import com.vverba.economic.dto.EmployeeDto;
import com.vverba.economic.entity.Employee;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true), componentModel = MappingConstants.ComponentModel.SPRING, uses = {PersonMapper.class, SalaryMapper.class, DepartmentMapper.class, PositionMapper.class})
public interface EmployeeMapper extends IMapper<Employee, EmployeeDto> {
    Employee toEntity(EmployeeDto employeeDto);

    EmployeeDto toDto(Employee employee);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Employee partialUpdate(EmployeeDto employeeDto, @MappingTarget Employee employee);
}