package com.vverba.economic.controller;

import com.vverba.economic.dto.SalaryDto;
import com.vverba.economic.service.SalaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/salary")
public class SalaryController {

    private final SalaryService service;

    public SalaryController(SalaryService service) {
        this.service = service;
    }

    @PostMapping
    public SalaryDto create(@RequestBody SalaryDto dto) {
        return service.create(dto);
    }

    @PutMapping
    public SalaryDto update(@RequestBody SalaryDto dto) {
        return service.update(dto);
    }

    @GetMapping("/{id}")
    public SalaryDto findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @GetMapping
    public List<SalaryDto> findAll() {
        return service.findAll();
    }
}