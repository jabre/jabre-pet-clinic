package com.jabre.petclinic.services.map;

import com.jabre.petclinic.model.Speciality;
import com.jabre.petclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 1/4/2022, Tuesday
 **/
@Service
public class SpecialitiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtiesService {

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }
}
