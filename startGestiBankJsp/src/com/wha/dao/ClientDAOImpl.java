package com.wha.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wha.model.Client;
@Repository
public class ClientDAOImpl implements ClientDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addClient(Client Client) {
        sessionFactory.getCurrentSession().saveOrUpdate(Client);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Client> getAllClients() {
 
        return sessionFactory.getCurrentSession().createQuery("from Client")
                .list();
    }
 
    @Override
    public void deleteClient(Integer ClientId) {
        Client Client = (Client) sessionFactory.getCurrentSession().load(
                Client.class, ClientId);
        if (null != Client) {
            this.sessionFactory.getCurrentSession().delete(Client);
        }
 
    }
 
    public Client getClient(int empid) {
        return (Client) sessionFactory.getCurrentSession().get(
                Client.class, empid);
    }
 
    @Override
    public Client updateClient(Client Client) {
        sessionFactory.getCurrentSession().update(Client);
        return Client;
    }
}
