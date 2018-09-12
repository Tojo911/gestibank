package com.wha.service;
/*Tojo*/
import java.util.List;

import com.wha.model.Administrateur;

public interface AdministrateurService {
	public void addAdministrateur(Administrateur Administrateur);

	public List<Administrateur> getAllAdministrateurs();

	public void deleteAdministrateur(Integer AdministrateurId);

	public Administrateur getAdministrateur(int Administrateurid);

	public Administrateur updateAdministrateur(Administrateur Administrateur);
}
