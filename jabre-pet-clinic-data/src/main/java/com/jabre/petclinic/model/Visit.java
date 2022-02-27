package com.jabre.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Author : Jabre
 * Created : 1/4/2022, Tuesday
 **/
@Data
@EqualsAndHashCode(exclude = {"pet"})
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

}
