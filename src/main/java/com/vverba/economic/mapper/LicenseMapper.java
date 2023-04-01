package com.vverba.economic.mapper;

import com.vverba.economic.dto.LicenseDto;
import com.vverba.economic.entity.License;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true), componentModel = MappingConstants.ComponentModel.SPRING, uses = {DepartmentMapper.class})
public interface LicenseMapper extends IMapper<License, LicenseDto> {
    License toEntity(LicenseDto licenseDto);

    LicenseDto toDto(License license);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    License partialUpdate(LicenseDto licenseDto, @MappingTarget License license);
}