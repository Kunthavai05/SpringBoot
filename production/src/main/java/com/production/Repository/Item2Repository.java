package com.production.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.production.Entity.Item2;
@Repository
public interface Item2Repository extends JpaRepository<Item2,UUID> {

}
