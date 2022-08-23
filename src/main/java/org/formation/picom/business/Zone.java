package org.formation.picom.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Zone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	
	@ManyToMany(mappedBy = "lstZones")
	private List<Annonce> lstAnnonces;
	@OneToMany(mappedBy = "zone")
	private List<Arret> lstArrets;
}
