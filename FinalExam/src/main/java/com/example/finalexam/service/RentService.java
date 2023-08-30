package com.example.finalexam.service;

import com.example.finalexam.entity.Rent;
import com.example.finalexam.repository.RentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentService implements RentServiceInterface {

    private final RentDAO rentDAO;

    @Autowired
    public RentService(RentDAO rentDAO) {
        this.rentDAO = rentDAO;
    }

    @Override
    public List<Rent> getAllRents() {
        return rentDAO.getAllRents();
    }

    @Override
    public Rent getRentById(int id) {
        return rentDAO.getRentById(id);
    }

    @Override
    public void addRent(Rent rent) {
        rentDAO.addRent(rent);
    }

    @Override
    public void updateRent(int id, Rent rent) {
        rentDAO.updateRent(id, rent);
    }

    @Override
    public void deleteRent(int id) {
        rentDAO.deleteRent(id);
    }
}
