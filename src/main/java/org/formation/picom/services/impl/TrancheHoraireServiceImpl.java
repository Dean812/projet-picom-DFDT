package org.formation.picom.services.impl;

import java.util.List;

import org.formation.picom.business.TrancheHoraire;
import org.formation.picom.dao.TrancheHoraireDao;
import org.formation.picom.services.TrancheHoraireService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TrancheHoraireServiceImpl implements TrancheHoraireService {
	
	private TrancheHoraireDao trancheHoraireDao;

	@Override
	public List<TrancheHoraire> recupererTrancheHoraire() {
		return trancheHoraireDao.findAll();
	}

}
