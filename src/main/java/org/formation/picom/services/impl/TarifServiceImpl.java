package org.formation.picom.services.impl;

import java.util.List;

import javax.validation.Valid;

import org.formation.picom.dao.TarifDao;
import org.formation.picom.dao.TrancheHoraireDao;
import org.formation.picom.dao.ZoneDao;
import org.formation.picom.dto.TarifDto;
import org.formation.picom.business.Tarif;
import org.formation.picom.business.TrancheHoraire;
import org.formation.picom.business.Zone;
import org.formation.picom.services.TarifService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TarifServiceImpl implements TarifService {

	private final TarifDao tarifDao;
	private final ZoneDao zoneDao;
	private final TrancheHoraireDao trancheHoraireDao;
	
	@Override
	public List<Tarif> recupererTarifs() {
		return tarifDao.findAll();
	}
	
	@Override
	public List<Zone> recupererZones() {
		return zoneDao.findAll();
	}
	
	@Override
	public List<TrancheHoraire> recupererTranchesHoraires() {
		return trancheHoraireDao.findAll();
	}

	@Override
	public Tarif enregistrerTarif(@Valid TarifDto tarifDto) {
		Tarif tarif = new Tarif();
		tarif.setPrixEnEuros(tarifDto.getPrixEnEuros());
		tarif.setZone(tarifDto.getZone());
		tarif.setTrancheHoraire(tarifDto.getTrancheHoraire());
		return tarifDao.save(tarif);
	}
}
