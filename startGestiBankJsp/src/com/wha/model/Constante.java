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
	@Id
	
	private String nomvar;

	private String valvar;

	public Constante() {
	}

	public String getNomvar() {
		return nomvar;
	}

	public void setNomvar(String nomvar) {
		this.nomvar = nomvar;
	}

	public String getValvar() {
		return valvar;
	}

	public void setValvar(String valvar) {
		this.valvar = valvar;
	}
}