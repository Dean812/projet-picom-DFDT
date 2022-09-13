package org.formation.picom.controller.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.formation.picom.business.Administrateur;
import org.formation.picom.business.Client;
import org.formation.picom.business.Utilisateur;
import org.formation.picom.dto.ClientDto;
import org.formation.picom.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("api/utilisateurs/")
public class UtilisateurRestController {

	@Autowired
	UtilisateurService utilisateurService;
	ObjectMapper om = new ObjectMapper();     // loggin phase 2

	@GetMapping("ensembleUtilisateurs")
	public List<Utilisateur> recupererUtilisateurs() {
		return utilisateurService.recupererUtilisateurs();
	}

	@PostMapping("clientDto")  // ne pas mettre dto ici <<----
	@ResponseStatus(code = HttpStatus.CREATED)
	public Utilisateur ajouterClient(@Valid @RequestBody ClientDto clientDto, BindingResult result) {

		Client client = new Client();
		client.setNom(clientDto.getNom());
		client.setPrenom(clientDto.getPrenom());
		client.setEmail(clientDto.getEmail());
		client.setMotDePasse(clientDto.getMotDePasse());
		client.setNumeroDeTelephone(clientDto.getNumeroDeTelephone());
		return utilisateurService.enregistrerUtilisateur(client);
	}

	@PostMapping("authUtilisateur")
	@ResponseStatus(code = HttpStatus.OK)
	public String recupererUtilisateur(@RequestBody ClientDto clientDto) throws Exception {   // suite au passage a >> writeValueAsString , remplacement de utilisateur par string
		Utilisateur utilisateurLog = utilisateurService.recupererUtilisateur(clientDto.getEmail(), clientDto.getMotDePasse()); // gestion log - coté log first 
		System.out.println(utilisateurLog instanceof Administrateur ); // vérifie si l'instance existe ( boolean )  - until , on identifie par true or false si admin or not ( only back/java) 
		Map<String,Object> logMap = new HashMap<>(); 
		if(utilisateurLog instanceof Administrateur) {
			logMap.put("utilisateur",utilisateurLog);
			logMap.put("role","roleAdmin");
		}else if(utilisateurLog instanceof Client){
			logMap.put("utilisateur",utilisateurLog);
			logMap.put("role","roleClient");
		}
		return om.writeValueAsString(logMap); // erreur , on nous demande un string, du coup > writeValueAsString, retourne un Json de la map ( qui est un string ) 
	}

}