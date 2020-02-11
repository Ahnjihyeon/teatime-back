package com.millionware.teatime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.millionware.teatime.vo.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
