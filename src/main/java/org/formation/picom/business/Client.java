package org.formation.picom.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString

public class Client extends Utilisateur {

	private String numeroDeTelephone;

	public Client(String nom, String prenom, String email, String motDePasse) {
		super(nom, prenom, email, motDePasse);
	}

	@OneToMany(mappedBy = "client")
	private List<Annonce> lstAnnonces;

}
