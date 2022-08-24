package org.formation.picom.business;

import javax.persistence.Entity;

@Entity

public class Administrateur extends Utilisateur {

	public Administrateur(String nom, String prenom, String email, String motDePasse) {
		super(nom, prenom, email, motDePasse);
	}

	public Administrateur() {
		super();
	}

	
	
}
