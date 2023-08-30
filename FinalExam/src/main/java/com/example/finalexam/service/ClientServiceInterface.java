package com.example.finalexam.service;

import com.example.finalexam.entity.Client;

import java.util.List;

public interface ClientServiceInterface {
    List<Client> getAllClients();
    Client getClientById(int id);
    void addClient(Client client);
    void updateClient(int id, Client client);
    void deleteClient(int id);
}
