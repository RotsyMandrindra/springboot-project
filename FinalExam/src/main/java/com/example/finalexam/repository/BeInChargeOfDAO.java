package com.example.finalexam.repository;

import com.example.finalexam.entity.BeInChargeOf;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BeInChargeOfDAO implements BeInChargeOfInterface {

    private final Map<Integer, BeInChargeOf> beInChargeOfMap = new HashMap<>();

    @Override
    public List<BeInChargeOf> getAllBeInChargeOf() {
        return new ArrayList<>(beInChargeOfMap.values());
    }

    @Override
    public BeInChargeOf getBeInChargeOfById(int id) {
        return beInChargeOfMap.get(id);
    }

    @Override
    public void addBeInChargeOf(BeInChargeOf beInChargeOf) {
        beInChargeOfMap.put(beInChargeOf.getIdBeInChargeOf(), beInChargeOf);
    }

    @Override
    public void updateBeInChargeOf(int id, BeInChargeOf updatedBeInChargeOf) {
        if (beInChargeOfMap.containsKey(id)) {
            updatedBeInChargeOf.setIdBeInChargeOf(id);
            beInChargeOfMap.put(id, updatedBeInChargeOf);
        }
    }

    @Override
    public void deleteBeInChargeOf(int id) {
        beInChargeOfMap.remove(id);
    }
}
