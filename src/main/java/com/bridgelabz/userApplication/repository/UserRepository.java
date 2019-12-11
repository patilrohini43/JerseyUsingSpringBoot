package com.bridgelabz.userApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.userApplication.model.User;

	public interface UserRepository extends JpaRepository<User, Long>{
		
		User findByEmail(String email);
		
	}

