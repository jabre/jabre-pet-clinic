package com.jabre.petclinic.repositories;

import com.jabre.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Author : Jabre
 * Created : 2/26/2022, Saturday
 **/
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
