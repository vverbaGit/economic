package com.vverba.economic.service;

import com.vverba.economic.dto.PersonDto;
import com.vverba.economic.dto.PositionDto;
import com.vverba.economic.entity.Person;
import com.vverba.economic.entity.Position;
import com.vverba.economic.mapper.IMapper;
import com.vverba.economic.mapper.PositionMapper;
import com.vverba.economic.repository.PositionRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PositionService extends AbstractCrudService<Position, PositionDto> {

    private final PositionRepository repository;
    private final PositionMapper mapper;

    public PositionService(PositionRepository repository, PositionMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    protected JpaRepository<Position, UUID> getRepository() {
        return repository;
    }

    @Override
    protected IMapper<Position, PositionDto> getMapper() {
        return mapper;
    }
}