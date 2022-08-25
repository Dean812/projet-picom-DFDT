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

	// définition des dépendances du service
	private UtilisateurDao utilisateurDao;
	private AdministrateurDao administrateurDao;
	private ClientDao clientDao;

	@Override
	public Utilisateur recupererUtilisateur(Long id) {
		return utilisateurDao.findById(id).orElse(null);
	}

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

}
