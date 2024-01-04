package com.jpa.onetomany.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.onetomany.entity.School;

public interface SclRepository extends JpaRepository<School, UUID> {
	
}

