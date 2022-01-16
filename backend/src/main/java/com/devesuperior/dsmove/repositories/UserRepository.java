package com.devesuperior.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.devesuperior.dsmove.entities.User;

public interface UserRepository extends JpaRepository< User, Long> {
	User findByEmail(String email);
	
}
