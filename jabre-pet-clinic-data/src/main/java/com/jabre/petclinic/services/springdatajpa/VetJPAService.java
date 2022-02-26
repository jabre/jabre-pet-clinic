package com.jabre.petclinic.services.springdatajpa;

import com.jabre.petclinic.model.Vet;
import com.jabre.petclinic.repositories.VetRepostiroy;
import com.jabre.petclinic.services.SpecialityService;
import com.jabre.petclinic.services.VetService;
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
public class VetJPAService implements VetService {

    private final VetRepostiroy vetRepostiroy;
    private final SpecialityService specialityService;

    public VetJPAService(VetRepostiroy vetRepostiroy, SpecialityService specialityService) {
        this.vetRepostiroy = vetRepostiroy;
        this.specialityService = specialityService;
    }

    @Override
    public Vet findById(Long aLong) {
        Optional<Vet> vet = vetRepostiroy.findById(aLong);
        return  vet.orElse(null);
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepostiroy.findAll().forEach(vets::add);
        return  vets;
    }

    @Override
    public Vet save(Vet object) {
        return vetRepostiroy.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepostiroy.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepostiroy.deleteById(aLong);
    }
}
