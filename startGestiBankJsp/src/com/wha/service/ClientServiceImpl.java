package com.wha.service;
//Adile le Russe
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.ClientDAO;
import com.wha.model.Client;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
    private ClientDAO ClientDAO;
 
    @Override
    @Transactional
    public void addClient(Client Client) {
        ClientDAO.addClient(Client);
    }
 
    @Override
    @Transactional
    public List<Client> getAllClients() {
        return ClientDAO.getAllClients();
    }
 
    @Override
    @Transactional
    public void deleteClient(Integer ClientId) {
        ClientDAO.deleteClient(ClientId);
    }
 
    public Client getClient(int empid) {
        return ClientDAO.getClient(empid);
    }
 
    public Client updateClient(Client Client) {
        // TODO Auto-generated method stub
        return ClientDAO.updateClient(Client);
    }
 
    public void setClientDAO(ClientDAO ClientDAO) {
        this.ClientDAO = ClientDAO;
    }

}
