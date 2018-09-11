package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the affectation database table.
 * 
 */
@Entity
@NamedQuery(name="Affectation.findAll", query="SELECT a FROM Affectation a")
public class Affectation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AffectationPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="date_aff")
	private Date dateAff;

	//bi-directional many-to-one association to Demande
	@ManyToOne
	@JoinColumn(name="id_demande")
	private Demande demande;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="id_administrateur")
	private Utilisateur utilisateur1;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="id_agent")
	private Utilisateur utilisateur2;

	public Affectation() {
	}

	public AffectationPK getId() {
		return this.id;
	}

	public void setId(AffectationPK id) {
		this.id = id;
	}

	public Date getDateAff() {
		return this.dateAff;
	}

	public void setDateAff(Date dateAff) {
		this.dateAff = dateAff;
	}

	public Demande getDemande() {
		return this.demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}

	public Utilisateur getUtilisateur1() {
		return this.utilisateur1;
	}

	public void setUtilisateur1(Utilisateur utilisateur1) {
		this.utilisateur1 = utilisateur1;
	}

	public Utilisateur getUtilisateur2() {
		return this.utilisateur2;
	}

	public void setUtilisateur2(Utilisateur utilisateur2) {
		this.utilisateur2 = utilisateur2;
	}

}