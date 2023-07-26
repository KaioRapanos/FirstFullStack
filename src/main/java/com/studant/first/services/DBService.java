package com.studant.first.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studant.first.domain.Todo;
import com.studant.first.repositories.TodoRepository;

import jakarta.transaction.Transactional;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	@Transactional
	public void instantiateDatabase() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "To study", "Study spring boot and Angular", LocalDateTime.parse("25/03/2024", dtf),
				false);
		Todo t2 = new Todo(null, "To read", "Read personal development book", LocalDateTime.parse("22/03/2024", dtf),
				true);
		Todo t3 = new Todo(null, "Exercises", "Practice physical exercises", LocalDateTime.parse("21/03/2024", dtf),
				false);
		Todo t4 = new Todo(null, "Meditate", "Meditate for 30 minutes in the morning",
				LocalDateTime.parse("27/03/2024", dtf), true);

		todoRepository.saveAllAndFlush(Arrays.asList(t1, t2, t3, t4));
	}

}
