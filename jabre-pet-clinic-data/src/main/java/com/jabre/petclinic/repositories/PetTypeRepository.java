package com.jabre.petclinic.repositories;

import com.jabre.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Author : Jabre
 * Created : 2/26/2022, Saturday
 **/
@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
