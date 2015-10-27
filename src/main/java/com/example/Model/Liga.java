package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Liga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected String nombre;

    @ManyToMany(mappedBy = "ligas")
    private Set<Temporada> temporadas = new HashSet<>();

}
