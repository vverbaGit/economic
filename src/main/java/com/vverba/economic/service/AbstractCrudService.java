package com.vverba.economic.service;

import com.vverba.economic.dto.AbstractDto;
import com.vverba.economic.entity.AbstractEntity;
import com.vverba.economic.exceptions.EntityExistsException;
import com.vverba.economic.exceptions.NotFoundException;
import com.vverba.economic.mapper.IMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public abstract class AbstractCrudService<ENTITY extends AbstractEntity, DTO extends AbstractDto> {

    protected abstract JpaRepository<ENTITY, UUID> getRepository();

    protected abstract IMapper<ENTITY, DTO> getMapper();

    public DTO create(DTO dto) {
        CrudRepository<ENTITY, UUID> repository = getRepository();
        IMapper<ENTITY, DTO> mapper = getMapper();
        Optional<Boolean> isExist = Optional.ofNullable(dto)
                .map(AbstractDto::getId)
                .map(repository::existsById);
        if (isExist.isPresent() && Boolean.TRUE.equals(isExist.get())) {
            throw new EntityExistsException();
        }
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public DTO update(DTO dto) {
        CrudRepository<ENTITY, UUID> repository = getRepository();
        IMapper<ENTITY, DTO> mapper = getMapper();
        Optional<Boolean> isExist = Optional.ofNullable(dto)
                .map(AbstractDto::getId)
                .map(repository::existsById);
        if (isExist.isPresent() && Boolean.FALSE.equals(isExist.get())) {
            throw new NotFoundException();
        }
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public DTO findById(UUID id) {
        CrudRepository<ENTITY, UUID> repository = getRepository();
        IMapper<ENTITY, DTO> mapper = getMapper();
        return repository.findById(id).map(mapper::toDto).orElseThrow(NotFoundException::new);
    }

    public void deleteById(UUID id) {
        CrudRepository<ENTITY, UUID> repository = getRepository();
        if (!repository.existsById(id)) {
            throw new NotFoundException();
        }
        repository.deleteById(id);
    }

    public List<DTO> findAll() {
        IMapper<ENTITY, DTO> mapper = getMapper();
        return getRepository().findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }
}