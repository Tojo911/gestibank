package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the affectation database table.
 * 
 */
@Embeddable
public class AffectationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_administrateur", insertable=false, updatable=false)
	private int idAdministrateur;

	@Column(name="id_agent", insertable=false, updatable=false)
	private int idAgent;

	@Column(name="id_demande", insertable=false, updatable=false)
	private int idDemande;

	public AffectationPK() {
	}
	public int getIdAdministrateur() {
		return this.idAdministrateur;
	}
	public void setIdAdministrateur(int idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}
	public int getIdAgent() {
		return this.idAgent;
	}
	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}
	public int getIdDemande() {
		return this.idDemande;
	}
	public void setIdDemande(int idDemande) {
		this.idDemande = idDemande;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AffectationPK)) {
			return false;
		}
		AffectationPK castOther = (AffectationPK)other;
		return 
			(this.idAdministrateur == castOther.idAdministrateur)
			&& (this.idAgent == castOther.idAgent)
			&& (this.idDemande == castOther.idDemande);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAdministrateur;
		hash = hash * prime + this.idAgent;
		hash = hash * prime + this.idDemande;
		
		return hash;
	}
}