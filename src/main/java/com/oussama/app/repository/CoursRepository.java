package com.oussama.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oussama.app.entities.Cours;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Integer>{

}
