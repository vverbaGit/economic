package com.vverba.economic.service;

import com.vverba.economic.dto.EmployeeDto;
import com.vverba.economic.entity.Employee;
import com.vverba.economic.mapper.EmployeeMapper;
import com.vverba.economic.mapper.IMapper;
import com.vverba.economic.repository.EmployeeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmployeeService extends AbstractCrudService<Employee, EmployeeDto> {

    private final EmployeeRepository repository;
    private final EmployeeMapper mapper;

    public EmployeeService(EmployeeRepository repository, EmployeeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    protected JpaRepository<Employee, UUID> getRepository() {
        return repository;
    }

    @Override
    protected IMapper<Employee, EmployeeDto> getMapper() {
        return mapper;
    }
}