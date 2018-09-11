package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the notification database table.
 * 
 */
@Entity
@NamedQuery(name="Notification.findAll", query="SELECT n FROM Notification n")
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_notification")
	private int idNotification;

	@Temporal(TemporalType.DATE)
	@Column(name="date_notification")
	private Date dateNotification;

	@Column(name="message_notification")
	private String messageNotification;

	//bi-directional many-to-one association to Operation
	@ManyToOne
	@JoinColumn(name="numero_operation")
	private Operation operation;

	//bi-directional many-to-one association to Compte
	@ManyToOne
	@JoinColumn(name="numero_compte")
	private Compte compte;

	public Notification() {
	}

	public int getIdNotification() {
		return this.idNotification;
	}

	public void setIdNotification(int idNotification) {
		this.idNotification = idNotification;
	}

	public Date getDateNotification() {
		return this.dateNotification;
	}

	public void setDateNotification(Date dateNotification) {
		this.dateNotification = dateNotification;
	}

	public String getMessageNotification() {
		return this.messageNotification;
	}

	public void setMessageNotification(String messageNotification) {
		this.messageNotification = messageNotification;
	}

	public Operation getOperation() {
		return this.operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}