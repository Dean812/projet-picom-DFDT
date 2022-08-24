package org.formation.picom.initialisation;

import org.formation.picom.business.Administrateur;
import org.formation.picom.business.Client;
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
		ajouterClients();
		ajouterAdministrateurs();
	}

		
	private void ajouterClients() {
						
		Client client = new Client();
		client.setNom("Lamontagne");
		client.setPrenom("Neville");
		client.setEmail("client1@orsys.fr");
		client.setMotDePasse("12345678");
		client.setNumeroDeTelephone("0798765432");	
		
		utilisateurDao.save(client);
	
	}

	private void ajouterAdministrateurs() {
			
		Administrateur administrateur = new Administrateur();
		administrateur.setNom("Pochet");
		administrateur.setPrenom("Jennifer");
		administrateur.setEmail("admin1@orsys.fr");
		administrateur.setMotDePasse("12345678");
		
		utilisateurDao.save(administrateur);
		
	}

}
