package com.jabre.petclinic.model;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 12/3/2021, Friday
 **/
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
