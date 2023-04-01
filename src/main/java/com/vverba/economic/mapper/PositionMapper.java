package com.vverba.economic.mapper;

import com.vverba.economic.dto.PositionDto;
import com.vverba.economic.entity.Position;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, builder = @Builder(disableBuilder = true), componentModel = MappingConstants.ComponentModel.SPRING)
public interface PositionMapper extends IMapper<Position, PositionDto> {
    Position toEntity(PositionDto positionDto);

    PositionDto toDto(Position position);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Position partialUpdate(PositionDto positionDto, @MappingTarget Position position);
}