package com.millionware.teatime.service;

import java.util.List;

import com.millionware.teatime.vo.Order;

public interface OrderService {
	List<Order> findAll();
	
	void deleteById(Long id);
	
	Order save(Order order);
	
	
}
