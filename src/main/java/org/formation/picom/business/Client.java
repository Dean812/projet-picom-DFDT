package org.formation.picom.business;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.ToString;

@Entity
@ToString

public class Client extends Utilisateur {

	private String numeroDeTelephone;

	public Client(String nom, String prenom, String email, String motDePasse) {
		super(nom, prenom, email, motDePasse);
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}
	
	@OneToMany(mappedBy = "annonce")
	private Annonce annonce;

}
