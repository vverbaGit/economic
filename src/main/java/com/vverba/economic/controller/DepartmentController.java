package com.vverba.economic.controller;

import com.vverba.economic.dto.DepartmentDto;
import com.vverba.economic.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/department")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public DepartmentDto create(@RequestBody DepartmentDto dto) {
        return service.create(dto);
    }

    @PutMapping
    public DepartmentDto update(@RequestBody DepartmentDto dto) {
        return service.update(dto);
    }

    @GetMapping("/{id}")
    public DepartmentDto findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @GetMapping
    public List<DepartmentDto> findAll() {
        return service.findAll();
    }
}