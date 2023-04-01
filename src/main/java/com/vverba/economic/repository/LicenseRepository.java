package com.vverba.economic.repository;

import com.vverba.economic.entity.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LicenseRepository extends JpaRepository<License, UUID>, JpaSpecificationExecutor<License> {
}