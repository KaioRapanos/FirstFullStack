package com.studant.first.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studant.first.domain.Todo;
import com.studant.first.repositories.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;

	public Todo findById(Long id) {
		Optional<Todo> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Todo> findAllOpen() {
		List<Todo> list = repository.findAllOpen();
		return list;
	}



}