package com.jabre.petclinic.services;

import com.jabre.petclinic.model.Owner;


/**
 * Author : Jabre
 * Created : 12/3/2021, Friday
 **/
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
