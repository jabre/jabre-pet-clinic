package com.jabre.petclinic.model;

/**
 * Author : Jabre
 * Created : 12/3/2021, Friday
 **/
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
