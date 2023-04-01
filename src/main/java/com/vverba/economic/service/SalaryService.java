package com.vverba.economic.service;

import com.vverba.economic.dto.SalaryDto;
import com.vverba.economic.entity.Salary;
import com.vverba.economic.mapper.IMapper;
import com.vverba.economic.mapper.SalaryMapper;
import com.vverba.economic.repository.SalaryRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SalaryService extends AbstractCrudService<Salary, SalaryDto> {

    private final SalaryRepository repository;
    private final SalaryMapper mapper;

    public SalaryService(SalaryRepository repository, SalaryMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    protected JpaRepository<Salary, UUID> getRepository() {
        return repository;
    }

    @Override
    protected IMapper<Salary, SalaryDto> getMapper() {
        return mapper;
    }
}