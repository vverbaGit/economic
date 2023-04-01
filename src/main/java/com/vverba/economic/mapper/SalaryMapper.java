package com.vverba.economic.mapper;

import com.vverba.economic.dto.SalaryDto;
import com.vverba.economic.entity.Salary;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true), componentModel = MappingConstants.ComponentModel.SPRING)
public interface SalaryMapper extends IMapper<Salary, SalaryDto> {
    Salary toEntity(SalaryDto salaryDto);

    SalaryDto toDto(Salary salary);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Salary partialUpdate(SalaryDto salaryDto, @MappingTarget Salary salary);
}