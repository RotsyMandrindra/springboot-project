package com.example.finalexam.repository;

import com.example.finalexam.entity.Rent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RentDAO implements RentDAOInterface {

    private final Map<Integer, Rent> rentMap = new HashMap<>();
    private int nextId = 1;

    @Override
    public List<Rent> getAllRents() {
        return new ArrayList<>(rentMap.values());
    }

    @Override
    public Rent getRentById(int id) {
        return rentMap.get(id);
    }

    @Override
    public void addRent(Rent rent) {
        rent.setIdRent(nextId++);
        rentMap.put(rent.getIdRent(), rent);
    }

    @Override
    public void updateRent(int id, Rent updatedRent) {
        if (rentMap.containsKey(id)) {
            updatedRent.setIdRent(id);
            rentMap.put(id, updatedRent);
        }
    }

    @Override
    public void deleteRent(int id) {
        rentMap.remove(id);
    }
}
