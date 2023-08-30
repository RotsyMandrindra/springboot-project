package com.example.finalexam.repository;

import com.example.finalexam.entity.Apartment;

import java.util.List;

public interface ApartmentDAOInterface {
    List<Apartment> getAllApartments();
    Apartment getApartmentById(int id);
    void addApartment(Apartment apartment);
    void updateApartment(int id, Apartment apartment);
    void deleteApartment(int id);
}
