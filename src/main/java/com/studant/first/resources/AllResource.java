package com.studant.first.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studant.first.domain.All;
import com.studant.first.services.AllService;

@RestController
@RequestMapping(value = "/all")
public class AllResource {
	
	@Autowired
	private AllService allService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<All> findById(@PathVariable Long id){
		All obj = allService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
