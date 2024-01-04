package com.Image.Services;



import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Image.Repository.ImageRepository;
import com.Image.entity.Image;


@Service
public class ImageServices {
	
	@Autowired
	public ImageRepository imageRepository;

	public void saveImage(Image image) {
		imageRepository.save(image);	
		
	}

	public Image getImageById(UUID id) {
		
		return imageRepository.findById(id).orElse(null);
	}
//
//	public void saveImage(Image image) {
//		imageRepository.save(image);
//		
//	}

	

	
	
}
