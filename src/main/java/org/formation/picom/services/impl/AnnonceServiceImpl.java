package org.formation.picom.services.impl;

import org.formation.picom.business.Annonce;
import org.formation.picom.dao.AnnonceDao;
import org.formation.picom.services.AnnonceService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AnnonceServiceImpl implements AnnonceService {

	private AnnonceDao annonceDao;

	@Override
	public Annonce enregistrerAnnonce(Annonce annonce) {
		return annonceDao.save(annonce);
	}
}
