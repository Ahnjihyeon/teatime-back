package com.millionware.teatime.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.millionware.teatime.repository.OrderRepository;
import com.millionware.teatime.vo.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Order> findAll() {
		List<Order> orders = new ArrayList<>();
		orderRepository.findAll().forEach(e->orders.add(e));
		return orders;
	}

	@Override
	public void deleteById(Long id) {
		orderRepository.deleteById(id);
	}

	@Override
	public Order save(Order order) {
		orderRepository.save(order);
		return order;
	}

}
