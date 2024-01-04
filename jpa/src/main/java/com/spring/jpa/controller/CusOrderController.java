package com.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.jpa.entity.CusOrder;
import com.spring.jpa.service.CusService;

@RestController
@RequestMapping("/CusOrder")
public class CusOrderController {

	@Autowired
	private CusService cusservice;
	
	
	@PostMapping(value="/Order")
	public CusOrder Createorder(@RequestBody CusOrder Order) {
		cusservice.saveOrder(Order);
		return Order;
	}

}
