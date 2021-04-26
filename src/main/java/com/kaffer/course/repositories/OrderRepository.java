package com.kaffer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaffer.course.entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long>{
	
}
