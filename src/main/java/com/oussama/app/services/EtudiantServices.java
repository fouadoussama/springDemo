package com.oussama.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oussama.app.entities.Etudiant;
import com.oussama.app.repository.EtudiantRepositry;

@Service
public class EtudiantServices {
	
	@Autowired
	private EtudiantRepositry etudiantRepositry;
	
	public List<Etudiant> findEtudiant(){
		return etudiantRepositry.findAll();
	}
	
	public Etudiant addEtudiant(Etudiant etudiant){
		return etudiantRepositry.save(etudiant);
	}

}
