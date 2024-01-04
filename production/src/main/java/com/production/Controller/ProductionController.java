package com.production.Controller;

//import java.text.SimpleDateFormat;
//import java.time.LocalTime;
//import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.production.Dto.ProductionDto;
import com.production.Service.ProductionService;


@RestController
@RequestMapping("/production")
public class ProductionController {
	
	@Autowired
	private ProductionService productionService;
	
	
	@PostMapping(value = "/create")
	public String createcuss(@RequestBody ProductionDto productionDto) {
		productionService.saveProduction(productionDto);
		return"Created";
		
	    
	 

}

}
