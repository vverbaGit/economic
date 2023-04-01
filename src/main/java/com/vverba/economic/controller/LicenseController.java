package com.vverba.economic.controller;

import com.vverba.economic.dto.LicenseDto;
import com.vverba.economic.service.LicenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/license")
public class LicenseController {

    private final LicenseService service;

    public LicenseController(LicenseService service) {
        this.service = service;
    }

    @PostMapping
    public LicenseDto create(@RequestBody LicenseDto dto) {
        return service.create(dto);
    }

    @PutMapping
    public LicenseDto update(@RequestBody LicenseDto dto) {
        return service.update(dto);
    }

    @GetMapping("/{id}")
    public LicenseDto findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @GetMapping
    public List<LicenseDto> findAll() {
        return service.findAll();
    }
}