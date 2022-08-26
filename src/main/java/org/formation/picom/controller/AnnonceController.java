package org.formation.picom.controller;


import javax.validation.Valid;

import org.formation.picom.business.Annonce;
import org.formation.picom.services.AnnonceService;
import org.formation.picom.services.TrancheHoraireService;
import org.formation.picom.services.ZoneService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class AnnonceController {
	
	private final AnnonceService annonceService;
	private final ZoneService zoneService;
	private final TrancheHoraireService trancheHoraireService;
	
	@GetMapping(value = { "ajoutAnnonce" })
	public ModelAndView ajoutAnnonceGet(@ModelAttribute Annonce annonce) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("lstZones",zoneService.recupererZones());
		mav.addObject("lstTrancheHoraires", trancheHoraireService.recupererTrancheHoraire());
		mav.setViewName("ajoutAnnonce");
		return mav;
	}
	
	@PostMapping("ajoutAnnonce")
	public ModelAndView postAnnonce(@Valid @ModelAttribute Annonce annonce, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return ajoutAnnonceGet(annonce);
		} else {
			annonceService.enregistrerAnnonce(annonce);
			ModelAndView mav = new ModelAndView("redirect:dashboard");
			mav.addObject("notification", "Annonce ajoutée");
			return mav;
		}
	}	
}
