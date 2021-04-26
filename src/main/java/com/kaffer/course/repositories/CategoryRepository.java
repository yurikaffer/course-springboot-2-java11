package com.kaffer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaffer.course.entities.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long>{
	
}
