package com.wha.service;

//Marie Andre
import java.util.List;

import com.wha.model.Demande;

public interface DemandeService {
	public void addDemande(Demande demande);

	public List<Demande> getAllDemandes();

	public void deleteDemande(Integer demandeId);

	public Demande getDemande(int demandeid);

	public Demande updateDemande(Demande demande);
}
