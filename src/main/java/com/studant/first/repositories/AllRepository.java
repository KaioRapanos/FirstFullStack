package com.studant.first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studant.first.domain.All;

@Repository
public interface AllRepository extends JpaRepository<All, Long> {
	
	

}
