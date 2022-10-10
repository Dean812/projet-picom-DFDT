package org.formation.picom.business;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)

public class Client extends Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Merci de préciser votre noméro de téléphone")
	@NonNull
	private String numeroDeTelephone;

	public Client() {
		super();
	}

	public Client(String numeroDeTelephone) {
		super();
		this.numeroDeTelephone = numeroDeTelephone;
	}
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private List<Annonce> lstAnnonces;

	

}