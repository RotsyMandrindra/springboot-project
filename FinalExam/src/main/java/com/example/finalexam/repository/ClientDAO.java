package com.example.finalexam.repository;

import com.example.finalexam.entity.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ClientDAO implements ClientDAOInterface {

    private final Map<Integer, Client> clientMap = new HashMap<>();

    @Override
    public List<Client> getAllClients() {
        return new ArrayList<>(clientMap.values());
    }

    @Override
    public Client getClientById(int id) {
        return clientMap.get(id);
    }

    @Override
    public void addClient(Client client) {
        clientMap.put(client.getIdClient(), client);
    }

    @Override
    public void updateClient(int id, Client updatedClient) {
        if (clientMap.containsKey(id)) {
            updatedClient.setIdClient(id);
            clientMap.put(id, updatedClient);
        }
    }

    @Override
    public void deleteClient(int id) {
        clientMap.remove(id);
    }
}
