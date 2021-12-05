package com.jabre.petclinic.services;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 12/5/2021, Sunday
 **/
public interface CrudService<T, ID> {

    T findById(ID id);
    Set<T> findAll();
    T save(T object);
    void delete(T object);
    void deleteById(ID id);

}
