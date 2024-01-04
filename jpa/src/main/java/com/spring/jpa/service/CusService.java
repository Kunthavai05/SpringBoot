package com.spring.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.entity.Cus;
import com.spring.jpa.entity.CusAddress;
import com.spring.jpa.entity.CusOrder;
import com.spring.jpa.entity.CusOrderItem;
import com.spring.jpa.repository.CusAddressRepository;
import com.spring.jpa.repository.CusOrderItemRepository;
import com.spring.jpa.repository.CusOrderRepository;
import com.spring.jpa.repository.CusRepository;

@Service
public class CusService {
	@Autowired
	private CusRepository cusRepository;
	
	@Autowired
	private CusAddressRepository cusAddressRepository;
	
	@Autowired
	private CusOrderRepository cusOrderRepository;
	
	@Autowired
	private CusOrderItemRepository cusOrderItemRepository;
	
	
	public void savecus(Cus cus) {
		cusRepository.save(cus);
		
	}

	public void saveAddess(CusAddress Address) {
		cusAddressRepository.save(Address);
	}

	public void saveOrder(CusOrder order) {
		
		cusOrderRepository.save(order);
	}

	public void saveOrderItem(CusOrderItem orderItem) {
		
		cusOrderItemRepository.save(orderItem);
	}

}
