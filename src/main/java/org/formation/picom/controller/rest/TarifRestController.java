package org.formation.picom.controller.rest;

import org.formation.picom.services.TarifService;
import org.formation.picom.services.TrancheHoraireService;
import org.formation.picom.services.ZoneService;

import java.util.List;

import javax.validation.Valid;

import org.formation.picom.business.Tarif;
import org.formation.picom.business.TrancheHoraire;
import org.formation.picom.business.Zone;
import org.formation.picom.dto.TarifDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tarifs/")
public class TarifRestController {

	@Autowired
	TarifService tarifService; 
	@Autowired
	ZoneService zoneService;
	@Autowired
	TrancheHoraireService trancheHoraireService;
	
	@GetMapping("ensembleTarif")
	public List<Tarif> recupererListes() {
		return tarifService.recupererTarifs();
	}

	@GetMapping("ensembleZone")
	public List<Zone> recupererZones() {
		return zoneService.recupererZones();
	}
	
	@GetMapping("ensembleTrancheHoraire")
	public List<TrancheHoraire> recupererTranchesHoraires() {
		return trancheHoraireService.recupererTrancheHoraire();
	}
	
	@PostMapping("ajoutTarif")
	@ResponseStatus(code = HttpStatus.OK)
	public Tarif ajouterTarif(@RequestBody TarifDto tarifDto, BindingResult result) {
		return tarifService.enregistrerTarif(tarifDto);
		// le code a été transférer dans TarifServiceImpl		
	}
	
	
}