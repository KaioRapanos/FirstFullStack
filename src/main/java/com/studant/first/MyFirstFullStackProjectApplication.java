package com.studant.first;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studant.first.domain.All;
import com.studant.first.repositories.AllRepository;

@SpringBootApplication
public class MyFirstFullStackProjectApplication implements CommandLineRunner{

	@Autowired
	private AllRepository allRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyFirstFullStackProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		All t1 = new All(null, "To study", "Study spring boot and Angular", LocalDateTime.parse("25/03/2022 10:40", dtf), false);
		
		allRepository.saveAll(Arrays.asList(t1));
	}

}
