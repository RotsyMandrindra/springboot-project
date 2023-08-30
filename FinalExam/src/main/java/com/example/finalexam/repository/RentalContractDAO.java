package com.example.finalexam.repository;

import com.example.finalexam.entity.RentalContract;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RentalContractDAO implements RentalContractDAOInterface {

    private final Map<Integer, RentalContract> rentalContractMap = new HashMap<>();
    private int nextId = 1;

    @Override
    public List<RentalContract> getAllRentalContracts() {
        return new ArrayList<>(rentalContractMap.values());
    }

    @Override
    public RentalContract getRentalContractById(int id) {
        return rentalContractMap.get(id);
    }

    @Override
    public void addRentalContract(RentalContract rentalContract) {
        rentalContract.setIdContract(nextId++);
        rentalContractMap.put(rentalContract.getIdContract(), rentalContract);
    }

    @Override
    public void updateRentalContract(int id, RentalContract updatedRentalContract) {
        if (rentalContractMap.containsKey(id)) {
            updatedRentalContract.setIdContract(id);
            rentalContractMap.put(id, updatedRentalContract);
        }
    }

    @Override
    public void deleteRentalContract(int id) {
        rentalContractMap.remove(id);
    }
}
