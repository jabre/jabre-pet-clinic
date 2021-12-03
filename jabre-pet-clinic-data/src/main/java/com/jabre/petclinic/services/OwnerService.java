package com.jabre.petclinic.services;

import com.jabre.petclinic.model.Owner;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 12/3/2021, Friday
 **/
public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
