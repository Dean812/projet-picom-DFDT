package org.formation.picom.services;

import org.formation.picom.business.Client;
import org.formation.picom.business.Utilisateur;

public interface UtilisateurService {

	Utilisateur recupererUtilisateur(String email, String motDePasse);
	
	Client recupererClient(String email, String motDePasse);
	
}
