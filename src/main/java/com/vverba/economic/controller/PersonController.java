package com.vverba.economic.controller;

import com.vverba.economic.dto.PersonDto;
import com.vverba.economic.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/person")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public PersonDto create(@RequestBody PersonDto dto) {
        return service.create(dto);
    }

    @PutMapping
    public PersonDto update(@RequestBody PersonDto dto) {
        return service.update(dto);
    }

    @GetMapping("/{id}")
    public PersonDto findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @GetMapping
    public List<PersonDto> findAll() {
        return service.findAll();
    }
}