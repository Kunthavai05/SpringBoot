package com.Image.Controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Image.Services.ImageServices;
import com.Image.entity.Image;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@RestController
@RequestMapping("/Image")
public class ImageController {
	@Autowired
	private  ImageServices   imageServices ;
	 @PostMapping("/upload")
	 public ResponseEntity<String> uploadImage(@RequestParam("name") String name, @RequestParam("status") String status, @RequestParam("file") MultipartFile file) {
	        try {
	            Image imageEntity = new Image();
	            imageEntity.setName(name);
	            imageEntity.setImage(file.getBytes());
	            
	            imageEntity.setStatus(status);
	            imageEntity.setDate(new Date());
	          
	            imageServices.saveImage(imageEntity);
	            return ResponseEntity.ok("Image uploaded successfully");
	        } catch (IOException e) {
	            return ResponseEntity.badRequest().body("Image upload failed");
	        }
	    }
	 
	 
	 @GetMapping("/{id:.+}")
	  public ResponseEntity<?> downloadImage(@PathVariable UUID id) throws Exception {
    	 
			
	    	try {

				Image imageObj = imageServices.getImageById(id);

				imageObj.getId();
				byte[] data = imageObj.getImage();
				InputStream inputStream = new ByteArrayInputStream(data);
				String fileNameText = imageObj.getName();
				String fileName = URLEncoder.encode(fileNameText, "UTF-8").replaceAll("\\+", "%20");
				String fileExtension = fileName.substring(fileName.lastIndexOf('.') + 1);
				if ("png".equals(fileExtension)){
	            return ResponseEntity.ok().header("Access-Control-Expose-Headers", "Content-Disposition")
	                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + imageObj.getName() +".png\"" )
	                  
	                    .contentType(MediaType.IMAGE_PNG)
	                    
	                    .body(new InputStreamResource(inputStream));
	            
	        }else if ("jpeg".equals(fileExtension)){
	            return ResponseEntity.ok().header("Access-Control-Expose-Headers", "Content-Disposition")
	                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + imageObj.getName() +".jpeg\"" )
	                  
	                    .contentType(MediaType.IMAGE_JPEG)
	                    
	                    .body(new InputStreamResource(inputStream));
	        }else if ("pdf".equals(fileExtension)){
	            return ResponseEntity.ok().header("Access-Control-Expose-Headers", "Content-Disposition")
	                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + imageObj.getName() +".pdf\"" )
	                  
	                    .contentType(MediaType.APPLICATION_PDF)
	                    
	                    .body(new InputStreamResource(inputStream));
	        } else {
	        	return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body("Unsupported file type");

	 }
} catch (Exception e) {
	e.printStackTrace();
	return (ResponseEntity<?>) ResponseEntity.badRequest();
	
}	    	
}
	 
}
