package org.formation.picom.dao;

import org.formation.picom.business.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceDao extends JpaRepository<Annonce, Long> {

}
