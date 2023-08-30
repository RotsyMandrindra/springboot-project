package com.example.finalexam.controller;

import com.example.finalexam.entity.Client;
import com.example.finalexam.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) {
        return clientService.getClientById(id);
    }

    @PostMapping
    public void addClient(@RequestBody Client client) {
        clientService.addClient(client);
    }

    @PutMapping("/{id}")
    public void updateClient(@PathVariable int id, @RequestBody Client client) {
        clientService.updateClient(id, client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable int id) {
        clientService.deleteClient(id);
    }
}
