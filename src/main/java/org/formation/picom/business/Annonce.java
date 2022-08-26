package org.formation.picom.business;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Entity
@Data
//@RequiredArgsConstructor
public class Annonce {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime dateHeureCreation;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime dateHeureDebut;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Future(message = "La date de fin doit être dans le future")
	private LocalDateTime dateHeureFin;
	private String contenu;
	@CreditCardNumber
	@NotEmpty(message = "Veuillez entrer un numéro de carte")
	private String numeroCarte;

	@NotNull(message = "Veuillez entrer une année d'expiration")
	private int anneeExpiration;

	@NotNull(message = "Veuillez entrer un mois d'expiration")
	private byte moisExpiration;

	@NotEmpty(message = "Veuillez entrer un cryptogramme")
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
