package com.spring.jpa.repository;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.spring.jpa.entity.Cus;

@Repository
public interface CusRepository extends CrudRepository<Cus, UUID>{

}
