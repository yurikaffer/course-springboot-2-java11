package com.kaffer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaffer.course.entities.OrderItem;

public interface  OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
