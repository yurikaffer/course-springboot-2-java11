package com.kaffer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaffer.course.entities.User;

public interface  UserRepository extends JpaRepository<User, Long>{
	
}
