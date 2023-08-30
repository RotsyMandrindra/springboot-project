package com.example.finalexam.service;

import com.example.finalexam.entity.Apartment;

import java.util.List;

public interface ApartmentServiceInterface {
    List<Apartment> getAllApartments();
    Apartment getApartmentById(int id);
    void addApartment(Apartment apartment);
    void updateApartment(int id, Apartment apartment);
    void deleteApartment(int id);
}
