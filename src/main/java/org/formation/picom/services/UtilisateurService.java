package org.formation.picom.services;

import java.util.List;

import javax.validation.Valid;

import org.formation.picom.business.Utilisateur;

public interface UtilisateurService {
	
	Utilisateur enregistrerUtilisateur(@Valid Utilisateur utilisateur);
	
	Utilisateur recupererUtilisateur(Long id);
	
	List<Utilisateur> recupererUtilisateurs();

}
