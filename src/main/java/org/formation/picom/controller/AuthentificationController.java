package org.formation.picom.controller;

import javax.servlet.http.HttpSession;

import org.formation.picom.business.Client;
import org.formation.picom.services.UtilisateurService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class AuthentificationController {

	HttpSession httpSession;
	UtilisateurService utilisateurService;

	@PostMapping(value = "connexion")
	public ModelAndView connexionPost(@RequestParam("EMAIL") String email,
			@RequestParam("MOT_DE_PASSE") String motDePasse) {

		Client client = utilisateurService.recupererClient(email, motDePasse);

		if (client == null) {
			ModelAndView mav = new ModelAndView("redirect:index");
			mav.addObject("notification", "Mot de passe et/ou email incorrect");
			return mav;
		} else {
			httpSession.setAttribute("utilisateur", client);

			return new ModelAndView("redirect:dashboard");
		}

	}

	@GetMapping(value = { "dashboard" })
	public ModelAndView dashboardGet() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("dashboard");
		return mav;
	}
}
