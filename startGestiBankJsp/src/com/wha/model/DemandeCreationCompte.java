package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the demande database table.
 * 
 */
@Entity
@NamedQuery(name="Demandecreationcompte.findAll", query="SELECT d FROM Demandedecreationdecompte d")
public class DemandeCreationCompte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_demande")
	private int idDemande;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datedemande;

	private String email;
	
	private String type;

	private byte etat;

	private String nom;

	private String prenom;

	private String textelibre;

	private String typecompteacreer;

	//bi-directional many-to-one association to Affectation
	@OneToMany(mappedBy="demande")
	private List<Affectation> affectations;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="id_agent")
	private Utilisateur utilisateur;


	public DemandeCreationCompte() {
	}

	public int getIdDemande() {
		return this.idDemande;
	}

	public void setIdDemande(int idDemande) {
		this.idDemande = idDemande;
	}

	public Date getDatedemande() {
		return this.datedemande;
	}

	public void setDatedemande(Date datedemande) {
		this.datedemande = datedemande;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getEtat() {
		return this.etat;
	}

	public void setEtat(byte etat) {
		this.etat = etat;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTextelibre() {
		return this.textelibre;
	}

	public void setTextelibre(String textelibre) {
		this.textelibre = textelibre;
	}

	public String getTypecompteacreer() {
		return this.typecompteacreer;
	}

	public void setTypecompteacreer(String typecompteacreer) {
		this.typecompteacreer = typecompteacreer;
	}


	public Compte getCompte1() {
		return this.compte1;
	}

	public void setCompte1(Compte compte1) {
		this.compte1 = compte1;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Compte getCompte2() {
		return this.compte2;
	}

	public void setCompte2(Compte compte2) {
		this.compte2 = compte2;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}