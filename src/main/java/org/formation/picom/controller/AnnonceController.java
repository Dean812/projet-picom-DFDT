package org.formation.picom.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class AnnonceController {

	
	@GetMapping(value = { "ajoutAnnonce" })
	public ModelAndView ajoutAnnonceGet() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ajoutAnnonce");
		return mav;
	}
	
}
