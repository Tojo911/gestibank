package com.wha.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


/** * The persistent class for the utilisateur database table.
 * 
 */
@Entity
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_utilisateur")
	private int idUtilisateur;

	private String adresse;

	@Temporal(TemporalType.DATE)
	private Date datedebutcontrat;

	private String email;

	private int matricule;

	private int mdp;

	private int nbenfant;

	private String nom;

	private String prenom;

	private String pseudonyme;

	private String situationmatrimonial;

	private String telephone;

	//bi-directional many-to-one association to Affectation
	@OneToMany(mappedBy="utilisateur1")
	private List<Affectation> affectations1;

	//bi-directional many-to-one association to Affectation
	@OneToMany(mappedBy="utilisateur2")
	private List<Affectation> affectations2;

	//bi-directional many-to-one association to Compte
	@OneToMany(mappedBy="utilisateur")
	private List<Compte> comptes;

	//bi-directional many-to-one association to Demande
	@OneToMany(mappedBy="utilisateur")
	private List<Demande> demandes;

	public Utilisateur() {
	}

	public int getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDatedebutcontrat() {
		return this.datedebutcontrat;
	}

	public void setDatedebutcontrat(Date datedebutcontrat) {
		this.datedebutcontrat = datedebutcontrat;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMatricule() {
		return this.matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public int getMdp() {
		return this.mdp;
	}

	public void setMdp(int mdp) {
		this.mdp = mdp;
	}

	public int getNbenfant() {
		return this.nbenfant;
	}

	public void setNbenfant(int nbenfant) {
		this.nbenfant = nbenfant;
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

	public String getPseudonyme() {
		return this.pseudonyme;
	}

	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}

	public String getSituationmatrimonial() {
		return this.situationmatrimonial;
	}

	public void setSituationmatrimonial(String situationmatrimonial) {
		this.situationmatrimonial = situationmatrimonial;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Affectation> getAffectations1() {
		return this.affectations1;
	}

	public void setAffectations1(List<Affectation> affectations1) {
		this.affectations1 = affectations1;
	}

	public Affectation addAffectations1(Affectation affectations1) {
		getAffectations1().add(affectations1);
		affectations1.setUtilisateur1(this);

		return affectations1;
	}

	public Affectation removeAffectations1(Affectation affectations1) {
		getAffectations1().remove(affectations1);
		affectations1.setUtilisateur1(null);

		return affectations1;
	}

	public List<Affectation> getAffectations2() {
		return this.affectations2;
	}

	public void setAffectations2(List<Affectation> affectations2) {
		this.affectations2 = affectations2;
	}

	public Affectation addAffectations2(Affectation affectations2) {
		getAffectations2().add(affectations2);
		affectations2.setUtilisateur2(this);

		return affectations2;
	}

	public Affectation removeAffectations2(Affectation affectations2) {
		getAffectations2().remove(affectations2);
		affectations2.setUtilisateur2(null);

		return affectations2;
	}

	public List<Compte> getComptes() {
		return this.comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public Compte addCompte(Compte compte) {
		getComptes().add(compte);
		compte.setUtilisateur(this);

		return compte;
	}

	public Compte removeCompte(Compte compte) {
		getComptes().remove(compte);
		compte.setUtilisateur(null);

		return compte;
	}

	public List<Demande> getDemandes() {
		return this.demandes;
	}

	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}

	public Demande addDemande(Demande demande) {
		getDemandes().add(demande);
		demande.setUtilisateur(this);

		return demande;
	}

	public Demande removeDemande(Demande demande) {
		getDemandes().remove(demande);
		demande.setUtilisateur(null);

		return demande;
	}

}