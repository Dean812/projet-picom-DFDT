package org.formation.picom.controller.rest;

import java.util.List;

import org.formation.picom.business.Utilisateur;
import org.formation.picom.services.UtilisateurService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/")
public class UtilisateurRestController {
	
	UtilisateurService utilisateurService;
	
	@GetMapping("AllUsers")
	public List<Utilisateur> recupererUtilisateurs() { 
		return utilisateurService.recupererUtilisateurs();
	}
	
} 