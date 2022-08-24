package org.formation.picom.initialisation;

import org.formation.picom.dao.UtilisateurDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AjoutDonneesInitiales implements CommandLineRunner {
	
	private final UtilisateurDao utilisateurDao;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public void ajouterUtilisateur() {
		if (utilisateurDao.count() == 0) {
			// on ajoute les utilisateurs à une map qui sera persistée en BDD
			
		}
	}

}
