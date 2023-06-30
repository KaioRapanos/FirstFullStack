package com.studant.first.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studant.first.domain.All;
import com.studant.first.repositories.AllRepository;

@Service
public class AllService {

	@Autowired
	private AllRepository allRepository;
	
	public All findById(Long id) {
		Optional<All> obj = allRepository.findById(id);
		return obj.orElse(null);
	}
}
