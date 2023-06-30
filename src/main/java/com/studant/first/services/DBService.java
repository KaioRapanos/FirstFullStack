package com.studant.first.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studant.first.domain.All;
import com.studant.first.repositories.AllRepository;

@Service
public class DBService {

	@Autowired
	private AllRepository allRepository;

	public void instantiateDatabase() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		All t1 = new All(null, "To study", "Study spring boot and Angular",
				LocalDateTime.parse("25/03/2022 10:40", dtf), false);

		allRepository.saveAll(Arrays.asList(t1));
	}

}
