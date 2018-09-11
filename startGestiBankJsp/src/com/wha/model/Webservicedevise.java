package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the webservicedevise database table.
 * 
 */
@Entity
@NamedQuery(name="Webservicedevise.findAll", query="SELECT w FROM Webservicedevise w")
public class Webservicedevise implements Serializable {
	private static final long serialVersionUID = 1L;

	private float courdevisecible;

	private float montantdevise;

	public Webservicedevise() {
	}

	public float getCourdevisecible() {
		return this.courdevisecible;
	}

	public void setCourdevisecible(float courdevisecible) {
		this.courdevisecible = courdevisecible;
	}

	public float getMontantdevise() {
		return this.montantdevise;
	}

	public void setMontantdevise(float montantdevise) {
		this.montantdevise = montantdevise;
	}

}