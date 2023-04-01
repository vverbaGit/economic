package com.vverba.economic.service;

import com.vverba.economic.dto.DepartmentDto;
import com.vverba.economic.entity.Department;
import com.vverba.economic.mapper.DepartmentMapper;
import com.vverba.economic.mapper.IMapper;
import com.vverba.economic.repository.DepartmentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DepartmentService extends AbstractCrudService<Department, DepartmentDto> {

    private final DepartmentRepository repository;
    private final DepartmentMapper mapper;

    public DepartmentService(DepartmentRepository repository,
                             DepartmentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    protected JpaRepository<Department, UUID> getRepository() {
        return repository;
    }

    @Override
    protected IMapper<Department, DepartmentDto> getMapper() {
        return mapper;
    }
}