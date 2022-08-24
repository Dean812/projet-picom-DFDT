package org.formation.picom.controller;

import org.formation.picom.services.UtilisateurService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class AuthentificationController {

	UtilisateurService utilisateurService;

	@GetMapping(value = { "/index", "/" })
	public ModelAndView connexionGet() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	

}
