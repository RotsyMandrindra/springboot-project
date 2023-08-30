package com.example.finalexam.repository;

import com.example.finalexam.entity.Apartment;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ApartmentDAO implements ApartmentDAOInterface {

    private final Map<Object, Apartment> apartments = new HashMap<>();

    @Override
    public List<Apartment> getAllApartments() {
        return new ArrayList<>(apartments.values());
    }

    @Override
    public Apartment getApartmentById(int id) {
        return apartments.get(id);
    }

    @Override
    public void addApartment(Apartment apartment) {
        apartment.setIdApartment(generateNextId());
        apartment.setDateAdded(LocalDateTime.now());
        apartments.put(apartment.getIdApartment(), apartment);
    }

    @Override
    public void updateApartment(int id, Apartment updatedApartment) {
        if (apartments.containsKey(id)) {
            updatedApartment.setIdApartment(id);
            apartments.put(id, updatedApartment);
        }
    }

    @Override
    public void deleteApartment(int id) {
        apartments.remove(id);
    }

    private int generateNextId() {
        return apartments.size() + 1;
    }
}
