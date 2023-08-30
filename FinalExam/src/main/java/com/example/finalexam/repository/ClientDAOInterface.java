package com.example.finalexam.repository;

import com.example.finalexam.entity.Client;

import java.util.List;

public interface ClientDAOInterface {
    List<Client> getAllClients();
    Client getClientById(int id);
    void addClient(Client client);
    void updateClient(int id, Client client);
    void deleteClient(int id);
}
