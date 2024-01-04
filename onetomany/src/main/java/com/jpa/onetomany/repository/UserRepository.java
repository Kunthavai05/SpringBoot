package com.jpa.onetomany.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.onetomany.entity.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}
