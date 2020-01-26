package com.adiel.doctriodapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Entity
@Table(name = "doctor")
public class Doctor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String specialization;

    @OneToMany(mappedBy = "doctor")
    @JsonIgnoreProperties("doctor")
    List<Address> address;

    @Column(name = "photo_url")
    String photoUrl;

    Double rating;

}
