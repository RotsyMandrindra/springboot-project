package com.example.finalexam.controller;

import com.example.finalexam.entity.Rent;
import com.example.finalexam.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rents")
public class RentController {

    private final RentService rentService;

    @Autowired
    public RentController(RentService rentService) {
        this.rentService = rentService;
    }

    @GetMapping
    public List<Rent> getAllRents() {
        return rentService.getAllRents();
    }

    @GetMapping("/{id}")
    public Rent getRentById(@PathVariable int id) {
        return rentService.getRentById(id);
    }

    @PostMapping
    public void addRent(@RequestBody Rent rent) {
        rentService.addRent(rent);
    }

    @PutMapping("/{id}")
    public void updateRent(@PathVariable int id, @RequestBody Rent rent) {
        rentService.updateRent(id, rent);
    }

    @DeleteMapping("/{id}")
    public void deleteRent(@PathVariable int id) {
        rentService.deleteRent(id);
    }
}
