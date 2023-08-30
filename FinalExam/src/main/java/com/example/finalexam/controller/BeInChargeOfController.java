package com.example.finalexam.controller;

import com.example.finalexam.entity.BeInChargeOf;
import com.example.finalexam.service.BeInChargeOfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beinchargeof")
public class BeInChargeOfController {

    private final BeInChargeOfService beInChargeOfService;

    @Autowired
    public BeInChargeOfController(BeInChargeOfService beInChargeOfService) {
        this.beInChargeOfService = beInChargeOfService;
    }

    @GetMapping("/all")
    public List<BeInChargeOf> getAllBeInChargeOf() {
        return beInChargeOfService.getAllBeInChargeOf(); // Utilisation de la méthode correcte
    }

    @GetMapping("/{id}")
    public BeInChargeOf getBeInChargeOfById(@PathVariable int id) {
        return beInChargeOfService.getBeInChargeOfById(id);
    }

    @PostMapping("/add")
    public void addBeInChargeOf(@RequestBody BeInChargeOf beInChargeOf) {
        beInChargeOfService.addBeInChargeOf(beInChargeOf);
    }

    @PutMapping("/{id}")
    public void updateBeInChargeOf(@PathVariable int id, @RequestBody BeInChargeOf beInChargeOf) {
        beInChargeOfService.updateBeInChargeOf(id, beInChargeOf);
    }

    @DeleteMapping("/{id}")
    public void deleteBeInChargeOf(@PathVariable int id) {
        beInChargeOfService.deleteBeInChargeOf(id);
    }
}
