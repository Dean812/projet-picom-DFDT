package org.formation.picom.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UtilisateurDto {
	
	@NotBlank(message = "Merci de préciser votre nom.")
	String nom;
	
	@NotBlank(message = "Merci de préciser votre prénom.")
	String prénom;
	
	@Email(message = "Merci de préciser une adresse mail au bon format")
	@NotBlank(message = "Merci de préciser une adresse email")
	@Pattern(regexp="^([A-Za-z0-9-])+(.[A-Za-z0-9-]+)*@orsys.fr$", message="Votre adresse doit faire partie du nom de domaine orsys.fr")
	String email;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@Size(min = 8, message = "Votre mot de passe doit comporter au minimum 8 caracères")
	String motDePasse;

}
