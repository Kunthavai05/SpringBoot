package com.details.Repository;


//import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.details.Entity.Details;


@Repository
public interface DetailsRepository extends JpaRepository<Details,UUID> {

}
