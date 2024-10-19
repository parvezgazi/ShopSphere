package com.gazi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gazi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	public User findByEmail(String username);

}
