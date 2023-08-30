package com.example.finalexam.service;

import com.example.finalexam.entity.BeInChargeOf;
import com.example.finalexam.repository.BeInChargeOfDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeInChargeOfService implements BeInChargeOfServiceInterface {

    private final BeInChargeOfDAO beInChargeOfDAO;

    @Autowired
    public BeInChargeOfService(BeInChargeOfDAO beInChargeOfDAO) {
        this.beInChargeOfDAO = beInChargeOfDAO;
    }

    @Override
    public List<BeInChargeOf> getAllBeInChargeOf() {
        return beInChargeOfDAO.getAllBeInChargeOf();
    }

    @Override
    public BeInChargeOf getBeInChargeOfById(int id) {
        return beInChargeOfDAO.getBeInChargeOfById(id);
    }

    @Override
    public void addBeInChargeOf(BeInChargeOf beInChargeOf) {
        beInChargeOfDAO.addBeInChargeOf(beInChargeOf);
    }

    @Override
    public void updateBeInChargeOf(int id, BeInChargeOf beInChargeOf) {
        beInChargeOfDAO.updateBeInChargeOf(id, beInChargeOf);
    }

    @Override
    public void deleteBeInChargeOf(int id) {
        beInChargeOfDAO.deleteBeInChargeOf(id);
    }
}
