package com.example.finalexam.controller;

import com.example.finalexam.entity.Apartment;
import com.example.finalexam.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {

    private final ApartmentService apartmentService;

    @Autowired
    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @GetMapping("/all")
    public List<Apartment> getAllApartments() {
        return apartmentService.getAllApartments();
    }

    @GetMapping("/{id}")
    public Apartment getApartmentById(@PathVariable int id) {
        return apartmentService.getApartmentById(id);
    }

    @PostMapping
    public void addApartment(@RequestBody Apartment apartment) {
        apartmentService.addApartment(apartment);
    }

    @PutMapping("/{id}")
    public void updateApartment(@PathVariable int id, @RequestBody Apartment apartment) {
        apartmentService.updateApartment(id, apartment);
    }

    @DeleteMapping("/{id}")
    public void deleteApartment(@PathVariable int id) {
        apartmentService.deleteApartment(id);
    }
}
