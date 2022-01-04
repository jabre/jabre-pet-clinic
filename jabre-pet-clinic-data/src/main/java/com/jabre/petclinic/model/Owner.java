package com.jabre.petclinic.model;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 12/3/2021, Friday
 **/
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
