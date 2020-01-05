package com.oussama.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oussama.app.entities.Cours;
import com.oussama.app.repository.CoursRepository;

@Service
public class CoursServices {

	@Autowired
	private CoursRepository coursRepository;
	
	public Cours addCour(Cours cour){
		return coursRepository.save(cour);
	}
}
