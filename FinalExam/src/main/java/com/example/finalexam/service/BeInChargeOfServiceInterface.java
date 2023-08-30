package com.example.finalexam.service;

import com.example.finalexam.entity.BeInChargeOf;

import java.util.List;

public interface BeInChargeOfServiceInterface {
    List<BeInChargeOf> getAllBeInChargeOf();
    BeInChargeOf getBeInChargeOfById(int id);
    void addBeInChargeOf(BeInChargeOf beInChargeOf);
    void updateBeInChargeOf(int id, BeInChargeOf beInChargeOf);
    void deleteBeInChargeOf(int id);
}
