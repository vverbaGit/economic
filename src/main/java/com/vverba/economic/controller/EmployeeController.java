package com.vverba.economic.controller;

import com.vverba.economic.dto.EmployeeDto;
import com.vverba.economic.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public EmployeeDto create(@RequestBody EmployeeDto dto) {
        return service.create(dto);
    }

    @PutMapping
    public EmployeeDto update(@RequestBody EmployeeDto dto) {
        return service.update(dto);
    }

    @GetMapping("/{id}")
    public EmployeeDto findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @GetMapping
    public List<EmployeeDto> findAll() {
        return service.findAll();
    }
}