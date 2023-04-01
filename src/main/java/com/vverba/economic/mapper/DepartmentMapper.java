package com.vverba.economic.mapper;

import com.vverba.economic.dto.DepartmentDto;
import com.vverba.economic.entity.Department;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true), componentModel = MappingConstants.ComponentModel.SPRING)
public interface DepartmentMapper extends IMapper<Department, DepartmentDto> {
    Department toEntity(DepartmentDto departmentDto);

    DepartmentDto toDto(Department department);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Department partialUpdate(DepartmentDto departmentDto, @MappingTarget Department department);
}