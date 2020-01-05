package com.oussama.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oussama.app.entities.Etudiant;
import com.oussama.app.services.EtudiantServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/Etudiant")
public class EtudiantController {
	
	@Autowired
	private EtudiantServices etudiantServices;
	
	@GetMapping("/getEtudiant")
	public List<Etudiant> getEtudiant(){
		return etudiantServices.findEtudiant();
	}

}
