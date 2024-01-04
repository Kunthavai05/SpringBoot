package com.production.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.production.Entity.Production;


@Repository
public interface ProductionRepository extends JpaRepository<Production,UUID> {

}
