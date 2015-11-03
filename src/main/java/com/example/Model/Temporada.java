package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected  Date year;

    @ManyToOne
    private Liga ligas;

    @ManyToMany
    private Set<Equipo> equipo = new HashSet<>();

    public Temporada() {
    }

    public Liga getLigas() {
        return ligas;
    }

    public void setLigas(Liga ligas) {
        this.ligas = ligas;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Equipo> getEquipo() {
        return equipo;
    }

    public void setEquipo(Set<Equipo> equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {

        return "Temporada{" +
                "id=" + id +
                ", year=" + year +

                '}';
    }
}
