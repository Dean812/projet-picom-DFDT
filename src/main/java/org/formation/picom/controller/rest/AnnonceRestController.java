package org.formation.picom.controller.rest;

import java.util.List;

import org.formation.picom.business.Annonce;
import org.formation.picom.services.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/annonces/")
public class AnnonceRestController {

	@Autowired
	AnnonceService annonceService;

	@GetMapping("ensembleAnnonces")
	public List<Annonce> recupererAnnonces() {
		return annonceService.recupererAnnonces();
	}

}
