package com.example.finalexam.repository;

import com.example.finalexam.entity.RentalContract;

import java.util.List;

public interface RentalContractDAOInterface {
    List<RentalContract> getAllRentalContracts();
    RentalContract getRentalContractById(int id);
    void addRentalContract(RentalContract rentalContract);
    void updateRentalContract(int id, RentalContract rentalContract);
    void deleteRentalContract(int id);
}
