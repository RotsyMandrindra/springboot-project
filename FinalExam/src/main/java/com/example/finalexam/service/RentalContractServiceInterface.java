package com.example.finalexam.service;

import com.example.finalexam.entity.RentalContract;

import java.util.List;

public interface RentalContractServiceInterface {
    List<RentalContract> getAllRentalContracts();
    RentalContract getRentalContractById(int id);
    void addRentalContract(RentalContract rentalContract);
    void updateRentalContract(int id, RentalContract rentalContract);
    void deleteRentalContract(int id);
}
