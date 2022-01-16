package com.devesuperior.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesuperior.dsmove.entities.Score;
import com.devesuperior.dsmove.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score,ScorePK> {
	
	
}
