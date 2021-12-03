package com.jabre.petclinic.services;

import com.jabre.petclinic.model.Vet;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 12/3/2021, Friday
 **/
public interface VetService {

    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();
}
