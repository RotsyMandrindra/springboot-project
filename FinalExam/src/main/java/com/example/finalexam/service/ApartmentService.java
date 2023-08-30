package com.example.finalexam.service;

import com.example.finalexam.entity.Apartment;
import com.example.finalexam.repository.ApartmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService implements ApartmentServiceInterface {

    private final ApartmentDAO apartmentDAO;

    @Autowired
    public ApartmentService(ApartmentDAO apartmentDAO) {
        this.apartmentDAO = apartmentDAO;
    }

    @Override
    public List<Apartment> getAllApartments() {
        return apartmentDAO.getAllApartments();
    }

    @Override
    public Apartment getApartmentById(int id) {
        return apartmentDAO.getApartmentById(id);
    }

    @Override
    public void addApartment(Apartment apartment) {
        apartmentDAO.addApartment(apartment);
    }

    @Override
    public void updateApartment(int id, Apartment apartment) {
        apartmentDAO.updateApartment(id, apartment);
    }

    @Override
    public void deleteApartment(int id){
        apartmentDAO.deleteApartment(id);
    }
}
