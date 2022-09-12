package org.formation.picom.dao;

import java.util.Optional;

import org.formation.picom.business.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

	Optional <Utilisateur> findByEmailAndMotDePasse(String email, String motDePasse);
	
}
