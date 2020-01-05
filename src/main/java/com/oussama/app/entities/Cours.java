package com.oussama.app.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Cours {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCours;
	@Column(name="nom_cours")
	private String nom;
	@OneToMany
	private List<Etudiant> etudiants;

}
