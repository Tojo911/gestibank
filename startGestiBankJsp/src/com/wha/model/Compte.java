package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

//P2
/**
 * The persistent class for the compte database table.
 * 
 */
@Entity
@NamedQuery(name="Compte.findAll", query="SELECT c FROM Compte c")
public class Compte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="numero_compte")
	private int numeroCompte;

	@Temporal(TemporalType.DATE)
	@Column(name="date_creation")
	private Date dateCreation;

	@Column(name="montant_decouvert")
	private int montantDecouvert;

	@Column(name="solde_cpt")
	private float soldeCpt;

	@Column(name="`taux-remuneration`")
	private float taux_remuneration;

	@Column(name="type_compte")
	private String typeCompte;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="id_client")
	private Utilisateur utilisateur;

	//bi-directional many-to-one association to Demande
	@OneToMany(mappedBy="compte1")
	private List<Demande> demandes1;

	//bi-directional many-to-one association to Demande
	@OneToMany(mappedBy="compte2")
	private List<Demande> demandes2;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="compte")
	private List<Notification> notifications;

	//bi-directional many-to-one association to Operation
	@OneToMany(mappedBy="compte")
	private List<Operation> operations;

	public Compte() {
	}

	public int getNumeroCompte() {
		return this.numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public int getMontantDecouvert() {
		return this.montantDecouvert;
	}

	public void setMontantDecouvert(int montantDecouvert) {
		this.montantDecouvert = montantDecouvert;
	}

	public float getSoldeCpt() {
		return this.soldeCpt;
	}

	public void setSoldeCpt(float soldeCpt) {
		this.soldeCpt = soldeCpt;
	}

	public float getTaux_remuneration() {
		return this.taux_remuneration;
	}

	public void setTaux_remuneration(float taux_remuneration) {
		this.taux_remuneration = taux_remuneration;
	}

	public String getTypeCompte() {
		return this.typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Demande> getDemandes1() {
		return this.demandes1;
	}

	public void setDemandes1(List<Demande> demandes1) {
		this.demandes1 = demandes1;
	}

	public Demande addDemandes1(Demande demandes1) {
		getDemandes1().add(demandes1);
		demandes1.setCompte1(this);

		return demandes1;
	}

	public Demande removeDemandes1(Demande demandes1) {
		getDemandes1().remove(demandes1);
		demandes1.setCompte1(null);

		return demandes1;
	}

	public List<Demande> getDemandes2() {
		return this.demandes2;
	}

	public void setDemandes2(List<Demande> demandes2) {
		this.demandes2 = demandes2;
	}

	public Demande addDemandes2(Demande demandes2) {
		getDemandes2().add(demandes2);
		demandes2.setCompte2(this);

		return demandes2;
	}

	public Demande removeDemandes2(Demande demandes2) {
		getDemandes2().remove(demandes2);
		demandes2.setCompte2(null);

		return demandes2;
	}

	public List<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public Notification addNotification(Notification notification) {
		getNotifications().add(notification);
		notification.setCompte(this);

		return notification;
	}

	public Notification removeNotification(Notification notification) {
		getNotifications().remove(notification);
		notification.setCompte(null);

		return notification;
	}

	public List<Operation> getOperations() {
		return this.operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public Operation addOperation(Operation operation) {
		getOperations().add(operation);
		operation.setCompte(this);

		return operation;
	}

	public Operation removeOperation(Operation operation) {
		getOperations().remove(operation);
		operation.setCompte(null);

		return operation;
	}

}