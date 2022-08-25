package org.formation.picom.services.impl;

import org.formation.picom.business.Client;
import org.formation.picom.business.Utilisateur;
import org.formation.picom.dao.ClientDao;
import org.formation.picom.dao.UtilisateurDao;
import org.formation.picom.services.UtilisateurService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {

	private UtilisateurDao utilisateurDao;
	private ClientDao clientDao;
	
	@Override
	public Utilisateur recupererUtilisateur(String email, String motDePasse) {
		return utilisateurDao.findByEmailAndMotDePasse(email, motDePasse);
	}

	@Override
	public Client recupererClient(String email, String motDePasse) {
		return clientDao.findByEmailAndMotDePasse(email, motDePasse);
	}

	
	
}
