package com.jabre.petclinic.services.map;

import com.jabre.petclinic.model.Owner;
import com.jabre.petclinic.services.CrudService;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 12/5/2021, Sunday
 **/
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}