package com.jabre.petclinic.services.springdatajpa;

import com.jabre.petclinic.model.PetType;
import com.jabre.petclinic.repositories.PetTypeRepository;
import com.jabre.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Author : Jabre
 * Created : 2/26/2022, Saturday
 **/
@Service
@Profile("springdatajpa")
public class PetTypeJPAService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeJPAService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public PetType findById(Long aLong) {
        Optional<PetType> petType = petTypeRepository.findById(aLong);
        return petType.orElse(null);
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
