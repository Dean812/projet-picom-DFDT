package org.formation.picom.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Tarif {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double prixEnEuros;
	
	@ManyToOne
	private Administrateur administrateur;
	@ManyToOne
	private TrancheHoraire trancheHoraire;
	@ManyToOne
	private Zone zone;
}
