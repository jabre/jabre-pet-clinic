package com.jabre.petclinic.services.springdatajpa;

import com.jabre.petclinic.model.Pet;
import com.jabre.petclinic.repositories.PetRepository;
import com.jabre.petclinic.services.PetService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Author : Jabre
 * Created : 2/26/2022, Saturday
 **/
public class PetJPAService implements PetService {

    private final PetRepository petRepository;

    public PetJPAService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findById(Long aLong) {
        Optional<Pet> pet = petRepository.findById(aLong);
        return pet.orElse(null);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
