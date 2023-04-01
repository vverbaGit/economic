package com.vverba.economic.service;

import com.vverba.economic.dto.PersonDto;
import com.vverba.economic.entity.Person;
import com.vverba.economic.mapper.IMapper;
import com.vverba.economic.mapper.PersonMapper;
import com.vverba.economic.repository.PersonRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PersonService extends AbstractCrudService<Person, PersonDto> {

    private final PersonRepository repository;
    private final PersonMapper mapper;

    public PersonService(PersonRepository repository, PersonMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    protected JpaRepository<Person, UUID> getRepository() {
        return repository;
    }

    @Override
    protected IMapper<Person, PersonDto> getMapper() {
        return mapper;
    }
}