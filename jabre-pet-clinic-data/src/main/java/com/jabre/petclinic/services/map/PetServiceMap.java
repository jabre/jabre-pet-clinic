package com.jabre.petclinic.services.map;

import com.jabre.petclinic.model.Pet;
import com.jabre.petclinic.services.CrudService;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 12/5/2021, Sunday
 **/
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return save(object.getId(), object);
    }
}
