package org.formation.picom.controller.rest;

import java.util.List;

import javax.validation.Valid;

import org.formation.picom.business.Client;
import org.formation.picom.business.Utilisateur;
import org.formation.picom.dto.ClientDto;
import org.formation.picom.services.UtilisateurService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/utilisateurs/")
public class UtilisateurRestController {
	
	UtilisateurService utilisateurService;

	@GetMapping("ensembleUtilisateurs")
	public List<Utilisateur> recupererUtilisateurs() {
		return utilisateurService.recupererUtilisateurs();
	}

	@PostMapping("clientDto")
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
	
	@GetMapping("authUtilisateur")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
    public Utilisateur recupererUtilisateur(String email,String motDePasse) {
        return utilisateurService.recupererUtilisateur(email, motDePasse);
    }
	
}