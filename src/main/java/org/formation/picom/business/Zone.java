package org.formation.picom.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@RequiredArgsConstructor
public class Zone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	
	@ManyToMany(mappedBy = "lstZones")
	@ToString.Exclude
	private List<Annonce> lstAnnonces;
	@JsonIgnore
	@OneToMany(mappedBy = "zone")
	private List<Arret> lstArrets;
}
