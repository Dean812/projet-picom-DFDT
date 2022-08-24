package org.formation.picom.initialisation;

import org.formation.picom.business.Administrateur;
import org.formation.picom.business.Arret;
import org.formation.picom.business.Client;
import org.formation.picom.business.TrancheHoraire;
import org.formation.picom.business.Zone;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AjoutDonneesInitiales implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		ajouterAdministrateur();
		ajouterClient();
		ajouterZone();
		ajouterArrets();
		ajouterTrancheHoraire();
	}

	public void ajouterAdministrateur() {
		Administrateur admnistrateur = new Administrateur();
		admnistrateur.setNom("Pochet");
		admnistrateur.setPrenom("Jennifer");
		admnistrateur.setEmail("admin1@orsys.fr");
		admnistrateur.setMotDePasse("12345678");
	}

	public void ajouterClient() {
		Client client = new Client();
		client.setNom("Lamontagne");
		client.setPrenom("Neville");
		client.setEmail("client1@orsys.fr");
		client.setMotDePasse("12345678");
		client.setNumeroDeTelephone("0798765432");
	}

	public void ajouterZone() {
		for (int i = 0; i < 5; i++) {
			Zone zone = new Zone();
			zone.setNom("zone " + (i + 1));
		}
	}

	public void ajouterArrets() {
		for (int i = 0; i < 20; i++) {
			Arret arret = new Arret();
			arret.setNom("arret" + (i + 1));
		}
	}
	
	public void ajouterTrancheHoraire() {
		for (int i = 6; i < 20; i++) {
			TrancheHoraire trancheHoraire = new TrancheHoraire();
			trancheHoraire.setDebut(i);
		}
	}

}
