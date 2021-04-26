package com.kaffer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaffer.course.entities.Product;

public interface  ProductRepository extends JpaRepository<Product, Long>{
	
}
