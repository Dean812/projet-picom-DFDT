package org.formation.picom.dao;

import org.formation.picom.business.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Long> {

	Client findByEmailAndMotDePasse(String email, String motDePasse);
	
}
