package com.production.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.production.Entity.Item1;

@Repository
public interface Item1Repository extends JpaRepository<Item1,UUID>{

}
