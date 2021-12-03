package com.jabre.petclinic.model;

import java.io.Serializable;

/**
 * Author : Jabre
 * Created : 12/3/2021, Friday
 **/
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
