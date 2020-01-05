package com.oussama.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oussama.app.entities.Etudiant;

@Repository
public interface EtudiantRepositry extends JpaRepository<Etudiant, Long>{

}
