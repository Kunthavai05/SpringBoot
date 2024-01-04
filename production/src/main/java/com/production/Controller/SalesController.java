package com.production.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.production.Dto.SalesDto;
import com.production.Entity.Sales;
import com.production.Service.SalesServices;

@RestController
@RequestMapping("/Sale")
public class SalesController {
	@Autowired
	private SalesServices salesServices;

	@PostMapping(value = "/value")
	public String createcuss(@RequestBody SalesDto salesDto) {
		salesServices.saveProduction(salesDto);
		return "Done";

	}

//getAllSales
	@GetMapping(value = "/get")
	public List<Sales> getAllsales() {
		return salesServices.getAllSales();
	}

// findbyCusId
	@GetMapping(value = "/getbycusid/{cus_id}")
	public List<Sales> getbyCusId(@PathVariable("cus_id") Integer cusId) {
		return salesServices.getBycusId(cusId);
	}

	//getbySalesdate	
		@GetMapping(value = "/getbydate")
		public List<Sales> findBySalesDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date salesDate) {
			return salesServices.findBydate(salesDate);
		}

}
