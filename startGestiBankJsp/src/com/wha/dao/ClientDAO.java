package com.wha.dao;

import java.util.List;

import com.wha.model.Client;

public interface ClientDAO {

	public void addClient(Client Client);

	public List<Client> getAllClients();

	public void deleteClient(Integer ClientId);

	public Client updateClient(Client Client);

	public Client getClient(int Clientid);
}
