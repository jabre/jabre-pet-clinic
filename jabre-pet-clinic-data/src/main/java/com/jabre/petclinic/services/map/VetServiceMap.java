package com.jabre.petclinic.services.map;

import com.jabre.petclinic.model.Vet;
import com.jabre.petclinic.services.VetService;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 12/5/2021, Sunday
 **/
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
