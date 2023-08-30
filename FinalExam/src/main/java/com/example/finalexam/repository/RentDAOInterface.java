package com.example.finalexam.repository;

import com.example.finalexam.entity.Rent;

import java.util.List;

public interface RentDAOInterface {
    List<Rent> getAllRents();
    Rent getRentById(int id);
    void addRent(Rent rent);
    void updateRent(int id, Rent rent);
    void deleteRent(int id);
}
