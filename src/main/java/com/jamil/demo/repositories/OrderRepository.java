package com.jamil.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamil.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
