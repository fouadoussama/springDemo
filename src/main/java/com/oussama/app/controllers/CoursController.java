package com.oussama.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oussama.app.entities.Cours;
import com.oussama.app.services.CoursServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/cours")
public class CoursController {

	@Autowired
	private CoursServices coursServices;
	
	@PostMapping()
	public Cours addCours(@RequestBody Cours cour){
		return coursServices.addCour(cour);
	}
	
	@GetMapping
	public String imUp(){
		return "I'm Up";
	}
}
