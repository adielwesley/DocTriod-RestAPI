package com.adiel.doctriodapi.model;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String street;

    Integer number;

    String neighborhood;

    String city;

    String state;

    String country;

    @ManyToOne
    Doctor doctor;

}
