package com.production.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.production.Entity.Transaction;

public interface TransRepository extends JpaRepository<Transaction,UUID> {

}
