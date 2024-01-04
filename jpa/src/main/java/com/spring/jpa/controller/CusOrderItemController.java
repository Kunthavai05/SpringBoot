package com.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.jpa.entity.CusOrderItem;
import com.spring.jpa.service.CusService;

@RestController
@RequestMapping("/CusOrederItem") 
public class CusOrderItemController {
	
	
	@Autowired
	private CusService cusservice;
	
	
	@PostMapping(value="/OrderItem")
	public CusOrderItem CreateOrderItem(@RequestBody CusOrderItem OrderItem) {
		cusservice.saveOrderItem(OrderItem);
		return OrderItem;
	}

}
