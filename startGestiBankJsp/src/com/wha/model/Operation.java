package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the operation database table.
 * 
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@NamedQuery(name="Operation.findAll", query="SELECT o FROM Operation o")
public class Operation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="numero_operation")
	private int numeroOperation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_operation")
	private Date dateOperation;

	@Column(name="libelle_operation")
	private String libelleOperation;

	private float montant;

	private String type;

	//bi-directional many-to-one association to Notification
	@OneToMany(mappedBy="operation")
	private List<Notification> notifications;

	//bi-directional many-to-one association to Compte
	@ManyToOne
	@JoinColumn(name="numero_compte")
	private Compte compte;

	public Operation() {
	}

	public int getNumeroOperation() {
		return this.numeroOperation;
	}

	public void setNumeroOperation(int numeroOperation) {
		this.numeroOperation = numeroOperation;
	}

	public Date getDateOperation() {
		return this.dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public String getLibelleOperation() {
		return this.libelleOperation;
	}

	public void setLibelleOperation(String libelleOperation) {
		this.libelleOperation = libelleOperation;
	}

	public float getMontant() {
		return this.montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public Notification addNotification(Notification notification) {
		getNotifications().add(notification);
		notification.setOperation(this);

		return notification;
	}

	public Notification removeNotification(Notification notification) {
		getNotifications().remove(notification);
		notification.setOperation(null);

		return notification;
	}

	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}