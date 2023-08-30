package com.example.finalexam.controller;

import com.example.finalexam.entity.RentalContract;
import com.example.finalexam.service.RentalContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rentalcontracts")
public class RentalContractController {

    private final RentalContractService rentalContractService;

    @Autowired
    public RentalContractController(RentalContractService rentalContractService) {
        this.rentalContractService = rentalContractService;
    }

    @GetMapping
    public List<RentalContract> getAllRentalContracts() {
        return rentalContractService.getAllRentalContracts();
    }

    @GetMapping("/{id}")
    public RentalContract getRentalContractById(@PathVariable int id) {
        return rentalContractService.getRentalContractById(id);
    }

    @PostMapping
    public void addRentalContract(@RequestBody RentalContract rentalContract) {
        rentalContractService.addRentalContract(rentalContract);
    }

    @PutMapping("/{id}")
    public void updateRentalContract(@PathVariable int id, @RequestBody RentalContract rentalContract) {
        rentalContractService.updateRentalContract(id, rentalContract);
    }

    @DeleteMapping("/{id}")
    public void deleteRentalContract(@PathVariable int id) {
        rentalContractService.deleteRentalContract(id);
    }
}
