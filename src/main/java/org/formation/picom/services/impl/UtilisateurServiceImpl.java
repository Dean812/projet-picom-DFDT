package org.formation.picom.services.impl;

import org.formation.picom.business.Utilisateur;
import org.formation.picom.dao.UtilisateurDao;
import org.formation.picom.services.UtilisateurService;

public class UtilisateurServiceImpl implements UtilisateurService {

	private UtilisateurDao utilisateurDao;
	
	@Override
	public Utilisateur recupererUtilisateur(String email, String motDePasse) {
		return utilisateurDao.findByEmailAndMotDePasse(email, motDePasse);
	}

	
	
}
