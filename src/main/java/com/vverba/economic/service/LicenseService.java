package com.vverba.economic.service;

import com.vverba.economic.dto.LicenseDto;
import com.vverba.economic.entity.License;
import com.vverba.economic.mapper.IMapper;
import com.vverba.economic.mapper.LicenseMapper;
import com.vverba.economic.repository.LicenseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LicenseService extends AbstractCrudService<License, LicenseDto> {

    private final LicenseRepository repository;
    private final LicenseMapper mapper;

    public LicenseService(LicenseRepository repository, LicenseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    protected JpaRepository<License, UUID> getRepository() {
        return repository;
    }

    @Override
    protected IMapper<License, LicenseDto> getMapper() {
        return mapper;
    }
}