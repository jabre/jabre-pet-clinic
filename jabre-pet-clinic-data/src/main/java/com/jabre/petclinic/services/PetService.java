package com.jabre.petclinic.services;

import com.jabre.petclinic.model.Pet;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 12/3/2021, Friday
 **/
public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
