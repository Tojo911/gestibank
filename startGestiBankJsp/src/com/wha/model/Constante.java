package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the constante database table.
 * 
 */
@Entity
@NamedQuery(name="Constante.findAll", query="SELECT c FROM Constante c")
public class Constante implements Serializable {
	private static final long serialVersionUID = 1L;

	private float tauxagios;

	private float tauxepargne;

	public Constante() {
	}

	public float getTauxagios() {
		return this.tauxagios;
	}

	public void setTauxagios(float tauxagios) {
		this.tauxagios = tauxagios;
	}

	public float getTauxepargne() {
		return this.tauxepargne;
	}

	public void setTauxepargne(float tauxepargne) {
		this.tauxepargne = tauxepargne;
	}

}