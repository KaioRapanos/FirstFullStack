package com.studant.first.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.studant.first.domain.Todo;

@Repository
@EnableJpaRepositories
public interface TodoRepository extends JpaRepository<Todo, Integer> {
	
	@Query("SELECT obj FROM Todo obj WHERE obj.finished = false ORDER BY obj.endDate")
	List<Todo> findAllOpen();

	@Query("SELECT obj FROM Todo obj WHERE obj.finished = true ORDER BY obj.endDate")
	List<Todo> findAllClose();

}
