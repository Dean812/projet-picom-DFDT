package org.formation.picom.services;

import java.util.List;

import org.formation.picom.business.Annonce;

public interface AnnonceService {

	Annonce enregistrerAnnonce(Annonce annonce);

	List<Annonce> recupererAnnonces();
}
