package com.jamil.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamil.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
