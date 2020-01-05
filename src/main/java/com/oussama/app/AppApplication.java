package com.oussama.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.oussama.app.entities.Etudiant;
import com.oussama.app.services.EtudiantServices;

@SpringBootApplication
@EntityScan
public class AppApplication {

	/*@Autowired
	private EtudiantServices etudiantServices;*/
	
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
	
	/*@Override
	public void run(String... args) throws Exception {
		
		Etudiant etudiant = new Etudiant();
		
		etudiant.setAge(12);
		etudiant.setNom("Oussama");
		etudiant.setPrenom("Fouad");
		
		etudiantServices.addEtudiant(etudiant);
		
	}*/

}
