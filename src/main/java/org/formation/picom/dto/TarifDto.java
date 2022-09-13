package org.formation.picom.dto;

import javax.validation.constraints.NotBlank;

import org.formation.picom.business.TrancheHoraire;
import org.formation.picom.business.Zone;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TarifDto {

	
	@NotBlank(message = "Merci de préciser le montant.")
	double prixEnEuros;
	
	@NotBlank(message = "Merci de préciser une tranche horaire.")
	TrancheHoraire trancheHoraire;
	
	@NotBlank(message = "Merci de préciser une zone")
	Zone zone;
	
	
	
}
