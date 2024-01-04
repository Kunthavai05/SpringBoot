package com.spring.jpa.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.entity.Cus;
import com.spring.jpa.entity.CusOrder;

@Repository
public interface CusOrderRepository extends CrudRepository<CusOrder, UUID> {

}
