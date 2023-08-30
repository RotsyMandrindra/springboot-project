package com.example.finalexam.service;

import com.example.finalexam.entity.Client;
import com.example.finalexam.repository.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements ClientServiceInterface {

    private final ClientDAO clientDAO;

    @Autowired
    public ClientService(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Override
    public List<Client> getAllClients() {
        return clientDAO.getAllClients();
    }

    @Override
    public Client getClientById(int id) {
        return clientDAO.getClientById(id);
    }

    @Override
    public void addClient(Client client) {
        clientDAO.addClient(client);
    }

    @Override
    public void updateClient(int id, Client client) {
        clientDAO.updateClient(id, client);
    }

    @Override
    public void deleteClient(int id) {
        clientDAO.deleteClient(id);
    }
}
