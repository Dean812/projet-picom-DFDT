package org.formation.picom.services.impl;


import java.util.List;

import javax.validation.Valid;

import org.formation.picom.business.Administrateur;
import org.formation.picom.business.Client;
import org.formation.picom.business.Utilisateur;
import org.formation.picom.dao.AdministrateurDao;
import org.formation.picom.dao.ClientDao;
import org.formation.picom.dao.UtilisateurDao;
import org.formation.picom.services.UtilisateurService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {

	
	private UtilisateurDao utilisateurDao;
	private AdministrateurDao administrateurDao;
	private ClientDao clientDao;


	@Override
	public List<Utilisateur> recupererUtilisateurs() {
		return utilisateurDao.findAll();

	}

	@Override
	public Utilisateur enregistrerUtilisateur(@Valid Utilisateur utilisateur) {
		return utilisateurDao.save(utilisateur);
	}

	@Override
	public Administrateur enregistrerAdministrateur(@Valid Administrateur administrateur) {
		return administrateurDao.save(administrateur);
	}

	@Override
	public Client enregistrerClient(@Valid Client client) {
		return clientDao.save(client);
	}
	
	@Override
	public Utilisateur recupererUtilisateur(String email, String motDePasse) {
		return utilisateurDao.findByEmailAndMotDePasse(email, motDePasse);
	}

	@Override
	public Client recupererClient(String email, String motDePasse) {
		return clientDao.findByEmailAndMotDePasse(email, motDePasse);
	}

}
