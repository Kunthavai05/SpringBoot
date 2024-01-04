package com.production.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.production.Entity.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales ,UUID>{

	List<Sales> findByCusId(Integer cusId);

	List<Sales> findBySalesDate(Date salesDate);

}
