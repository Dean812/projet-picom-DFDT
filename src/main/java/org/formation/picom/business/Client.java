package org.formation.picom.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)

public class Client extends Utilisateur {

    private String numeroDeTelephone;

    public Client(String nom, String prenom, String email, String motDePasse) {
        super(nom, prenom, email, motDePasse);
    }

    public Client() {
        super();
    }

    public Client(String numeroDeTelephone) {
        super();
        this.numeroDeTelephone = numeroDeTelephone;
    }



    @OneToMany(mappedBy = "client")
    private List<Annonce> lstAnnonces;

}