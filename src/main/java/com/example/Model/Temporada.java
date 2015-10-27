package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;


    protected Date year;

    @ManyToMany
    private Set<Liga> ligas = new HashSet<>();
}
