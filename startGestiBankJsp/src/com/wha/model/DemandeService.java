package com.wha.model;

import java.util.List;

import com.wha.model.Demande;

public interface DemandeService {
	public void addDemande(Demande compte);

	public List<Demande> getAllDemandes();

	public void deleteDemande(Integer compteId);

	public Demande getDemande(int compteid);

	public Demande updateDemande(Demande compte);
}
