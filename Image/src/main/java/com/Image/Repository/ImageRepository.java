package com.Image.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Image.entity.Image;

@Repository
public interface ImageRepository  extends JpaRepository<Image,UUID>{

	

}
