package com.wha.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wha.model.Administrateur;
@Repository
public class AdministrateurDAOImpl implements AdministrateurDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addAdministrateur(Administrateur Administrateur) {
        sessionFactory.getCurrentSession().saveOrUpdate(Administrateur);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Administrateur> getAllAdministrateurs() {
 
        return sessionFactory.getCurrentSession().createQuery("from Administrateur")
                .list();
    }
 
    @Override
    public void deleteAdministrateur(Integer AdministrateurId) {
        Administrateur Administrateur = (Administrateur) sessionFactory.getCurrentSession().load(
                Administrateur.class, AdministrateurId);
        if (null != Administrateur) {
            this.sessionFactory.getCurrentSession().delete(Administrateur);
        }
 
    }
 
    public Administrateur getAdministrateur(int empid) {
        return (Administrateur) sessionFactory.getCurrentSession().get(
                Administrateur.class, empid);
    }
 
    @Override
    public Administrateur updateAdministrateur(Administrateur Administrateur) {
        sessionFactory.getCurrentSession().update(Administrateur);
        return Administrateur;
    }
}
