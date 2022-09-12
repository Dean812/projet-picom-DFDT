package org.formation.picom.dto;



import javax.validation.constraints.NotBlank;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientDto extends UtilisateurDto {

	@NotBlank(message = "Merci de rentrer un numéro de téléphone valide.")
	String numeroDeTelephone;
	
}
