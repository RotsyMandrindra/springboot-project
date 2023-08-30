package com.example.finalexam.service;

import com.example.finalexam.entity.Rent;

import java.util.List;

public interface RentServiceInterface {
    List<Rent> getAllRents();
    Rent getRentById(int id);
    void addRent(Rent rent);
    void updateRent(int id, Rent rent);
    void deleteRent(int id);
}
