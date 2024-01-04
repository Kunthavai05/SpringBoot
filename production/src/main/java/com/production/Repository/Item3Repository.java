package com.production.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.production.Entity.Item3;


@Repository
public interface Item3Repository extends JpaRepository<Item3,UUID>{

}
