package org.formation.picom.services;

import java.util.List;

import javax.validation.Valid;

import org.formation.picom.business.Administrateur;
import org.formation.picom.business.Client;
import org.formation.picom.business.Utilisateur;

public interface UtilisateurService {

	Utilisateur recupererUtilisateur(Long id);

	List<Utilisateur> recupererUtilisateurs();

	Utilisateur enregistrerUtilisateur(@Valid Utilisateur utilisateur);

	Administrateur enregistrerAdministrateur(@Valid Administrateur administrateur);

	Client enregistrerClient(@Valid Client client);

}
