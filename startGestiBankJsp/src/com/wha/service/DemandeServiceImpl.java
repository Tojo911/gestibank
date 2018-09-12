package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.DemandeDAO;
import com.wha.model.Demande;

@Service
@Transactional
public class DemandeServiceImpl implements DemandeService {

	@Autowired
    private DemandeDAO demandeDAO;
 
    @Override
    @Transactional
    public void addDemande(Demande demande) {
        demandeDAO.addDemande(demande);
    }
 
    @Override
    @Transactional
    public List<Demande> getAllDemandes() {
        return demandeDAO.getAllDemandes();
    }
 
    @Override
    @Transactional
    public void deleteDemande(Integer demandeId) {
        demandeDAO.deleteDemande(demandeId);
    }
 
    public Demande getDemande(int dmdid) {
        return demandeDAO.getDemande(dmdid);
    }
 
    public Demande updateDemande(Demande demande) {
        // TODO Auto-generated method stub
        return demandeDAO.updateDemande(demande);
    }
 
    public void setDemandeDAO(DemandeDAO demandeDAO) {
        this.demandeDAO = demandeDAO;
    }

}
