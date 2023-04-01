package com.vverba.economic.controller;

import com.vverba.economic.dto.PositionDto;
import com.vverba.economic.service.PositionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/position")
public class PositionController {

    private final PositionService service;

    public PositionController(PositionService service) {
        this.service = service;
    }

    @PostMapping
    public PositionDto create(@RequestBody PositionDto dto) {
        return service.create(dto);
    }

    @PutMapping
    public PositionDto update(@RequestBody PositionDto dto) {
        return service.update(dto);
    }

    @GetMapping("/{id}")
    public PositionDto findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @GetMapping
    public List<PositionDto> findAll() {
        return service.findAll();
    }
}