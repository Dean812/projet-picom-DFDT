package org.formation.picom.services;

import java.util.List;

import javax.validation.Valid;

import org.formation.picom.business.Tarif;
import org.formation.picom.business.TrancheHoraire;
import org.formation.picom.business.Zone;
import org.formation.picom.dto.TarifDto;

public interface TarifService {

	List<Tarif> recupererTarifs();

	List<Zone> recupererZones();

	List<TrancheHoraire> recupererTranchesHoraires();
	
	Tarif enregistrerTarif(@Valid TarifDto tarifDto);

}
