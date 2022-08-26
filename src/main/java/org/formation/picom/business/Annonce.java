package org.formation.picom.business;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
//@RequiredArgsConstructor
public class Annonce {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDateTime dateHeureCreation;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDateTime dateHeureDebut;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDateTime dateHeureFin;
	private String contenu;
	private String numeroCarte;
	private int anneeExpiration;
	private byte moisExpiration;
	private String cryptogramme;
	private double montantRegleEnEuros;
	
	@ManyToOne
	private Client client;
	@ManyToMany
	private List<Zone> lstZones;
	@ManyToMany
	private List<TrancheHoraire> lstTrancheHoraires;
	
	public Annonce() {
		dateHeureCreation = LocalDateTime.now();
		}
}
