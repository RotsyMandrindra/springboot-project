package com.example.finalexam.repository;

import com.example.finalexam.entity.BeInChargeOf;

import java.util.List;

public interface BeInChargeOfInterface {
        List<BeInChargeOf> getAllBeInChargeOf();
        BeInChargeOf getBeInChargeOfById(int id);
        void addBeInChargeOf(BeInChargeOf beInChargeOf);
        void updateBeInChargeOf(int id, BeInChargeOf beInChargeOf);
        void deleteBeInChargeOf(int id);
}
