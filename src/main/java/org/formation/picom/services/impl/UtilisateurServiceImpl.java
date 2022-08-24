package org.formation.picom.services.impl;

import java.util.List;

import javax.validation.Valid;

import org.formation.picom.business.Utilisateur;
import org.formation.picom.dao.UtilisateurDao;
import org.formation.picom.services.UtilisateurService;

public class UtilisateurServiceImpl implements UtilisateurService {
	
	// définition des dépendances du service
	private UtilisateurDao utilisateurDao;
	

	@Override
	public Utilisateur enregistrerUtilisateur(@Valid Utilisateur utilisateur) {
		return utilisateurDao.save(utilisateur);
	}

	@Override
	public Utilisateur recupererUtilisateur(Long id) {
		return utilisateurDao.findById(id).orElse(null);
	}

	@Override
	public List<Utilisateur> recupererUtilisateurs() {
		return utilisateurDao.findAll();
	}

}
