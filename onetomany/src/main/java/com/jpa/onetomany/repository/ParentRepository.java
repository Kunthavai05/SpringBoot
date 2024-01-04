package com.jpa.onetomany.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.onetomany.entity.ParentEntity;

@Repository
public interface ParentRepository extends JpaRepository<ParentEntity , UUID>{

	}


