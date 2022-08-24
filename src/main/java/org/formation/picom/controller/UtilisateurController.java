package org.formation.picom.controller;

import javax.validation.Valid;

import org.formation.picom.business.Client;
import org.formation.picom.services.UtilisateurService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor

public class UtilisateurController {
	
	private final UtilisateurService utilisateurService;
	
	@GetMapping("inscription")
	public ModelAndView inscriptionGet(@ModelAttribute Client client) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("inscription");
		return mav;	
	}
		
	@PostMapping("inscription")
	public ModelAndView inscriptionPost(@Valid @ModelAttribute Client client, BindingResult result) {
		if(result.hasErrors()) {
			return inscriptionGet(client);
		} else {
			utilisateurService.enregistrerClient(client);
			ModelAndView mav = new ModelAndView("redirect:index");
			mav.addObject("notification", "Client ajouté");
			return mav;
		}
	}
}
