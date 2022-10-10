package org.formation.picom.services.impl;

import java.util.List;

import org.formation.picom.business.Zone;
import org.formation.picom.dao.ZoneDao;
import org.formation.picom.services.ZoneService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ZoneServiceImpl implements ZoneService {

	private final ZoneDao zoneDao;

	@Override
	public List<Zone> recupererZones() {
		return zoneDao.findAll();
	}

}
