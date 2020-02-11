package com.millionware.teatime.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.millionware.teatime.repository.OrderRepository;
import com.millionware.teatime.vo.Order;


@RestController
@EnableAutoConfiguration
@RequestMapping(value="/order")
public class OrderController {
	
	@Autowired
	OrderRepository orderRepository;
	
	@PostMapping("/")
	public @ResponseBody List<Order> createOrder(@RequestBody Map<String,String> param){
		String name = param.get("name");
		String menu = param.get("menu");
		//Order order = Order.builder().name(name).menu(menu).build();
		//orderRepository.save(order);
		
		return orderRepository.findAll();
		
	}
	
	
}
