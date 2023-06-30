package com.studant.first.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studant.first.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
	
	@Query("SELECT obj FROM Todo obj WHERE obj.finished = false ORDER BY obj.endDate ASC")
	List<Todo> findAllOpen();

}
