package com.jabre.petclinic.services.map;

import com.jabre.petclinic.model.Visit;
import com.jabre.petclinic.services.SpecialityService;
import com.jabre.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 2/26/2022, Saturday
 **/
@Service
@Profile({"default", "map"})
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null
                || visit.getPet().getOwner() == null
                || visit.getPet().getId() == null
                || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit!");
        }
        return super.save(visit);
    }
}
