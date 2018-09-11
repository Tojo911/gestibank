package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.AdministrateurDAO;
import com.wha.model.Administrateur;

@Service
@Transactional
public class AdministrateurServiceImpl implements AdministrateurService {

	@Autowired
    private AdministrateurDAO AdministrateurDAO;
 
    @Override
    @Transactional
    public void addAdministrateur(Administrateur Administrateur) {
        AdministrateurDAO.addAdministrateur(Administrateur);
    }
 
    @Override
    @Transactional
    public List<Administrateur> getAllAdministrateurs() {
        return AdministrateurDAO.getAllAdministrateurs();
    }
 
    @Override
    @Transactional
    public void deleteAdministrateur(Integer AdministrateurId) {
        AdministrateurDAO.deleteAdministrateur(AdministrateurId);
    }
 
    public Administrateur getAdministrateur(int empid) {
        return AdministrateurDAO.getAdministrateur(empid);
    }
 
    public Administrateur updateAdministrateur(Administrateur Administrateur) {
        // TODO Auto-generated method stub
        return AdministrateurDAO.updateAdministrateur(Administrateur);
    }
 
    public void setAdministrateurDAO(AdministrateurDAO AdministrateurDAO) {
        this.AdministrateurDAO = AdministrateurDAO;
    }

}
