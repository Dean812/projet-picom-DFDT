package org.formation.picom.controller.rest;

import org.formation.picom.services.TarifService;

import java.util.List;

import org.formation.picom.business.Tarif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tarifs/")
public class TarifRestController {

	@Autowired
	TarifService tarifService; 
	
	@GetMapping("ensembleTarif")
	public List<Tarif> recupererListes() {
		return tarifService.recupererTarifs();
	}
	
}
