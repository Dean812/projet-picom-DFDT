package org.formation.picom.services.impl;

import java.util.List;

import org.formation.picom.dao.TarifDao;
import org.formation.picom.business.Tarif;
import org.formation.picom.services.TarifService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TarifServiceImpl implements TarifService {

	private TarifDao tarifDao;
	
	@Override
	public List<Tarif> recupererTarifs() {
		return tarifDao.findAll();
	}
	
}
