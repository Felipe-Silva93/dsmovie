package com.devesuperior.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.dsmove.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	
}
