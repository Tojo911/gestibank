package com.wha.dao;

import java.util.List;

import com.wha.model.Administrateur;

public interface AdministrateurDAO {

	public void addAdministrateur(Administrateur Administrateur);

	public List<Administrateur> getAllAdministrateurs();

	public void deleteAdministrateur(Integer AdministrateurId);

	public Administrateur updateAdministrateur(Administrateur Administrateur);

	public Administrateur getAdministrateur(int Administrateurid);
}
