package com.example.finalexam.service;

import com.example.finalexam.entity.RentalContract;
import com.example.finalexam.repository.RentalContractDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalContractService implements RentalContractServiceInterface {

    private final RentalContractDAO rentalContractDAO;

    @Autowired
    public RentalContractService(RentalContractDAO rentalContractDAO) {
        this.rentalContractDAO = rentalContractDAO;
    }

    @Override
    public List<RentalContract> getAllRentalContracts() {
        return rentalContractDAO.getAllRentalContracts();
    }

    @Override
    public RentalContract getRentalContractById(int id) {
        return rentalContractDAO.getRentalContractById(id);
    }

    @Override
    public void addRentalContract(RentalContract rentalContract) {
        rentalContractDAO.addRentalContract(rentalContract);
    }

    @Override
    public void updateRentalContract(int id, RentalContract rentalContract) {
        rentalContractDAO.updateRentalContract(id, rentalContract);
    }

    @Override
    public void deleteRentalContract(int id) {
        rentalContractDAO.deleteRentalContract(id);
    }
}
