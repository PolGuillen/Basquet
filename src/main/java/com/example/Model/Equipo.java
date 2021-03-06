package com.example.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
    import javax.persistence.*;
    import java.util.Date;
    import java.util.HashSet;
    import java.util.Set;

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected String nombre;

    protected String localidad;

    protected Date fechaCreacion;

    @JsonIgnore
    @OneToMany(mappedBy = "equipo")
    Set<Jugador> jugadors = new HashSet<>();

    @JsonIgnore
    @ManyToMany(mappedBy = "equipo")
    Set<Temporada> temporadas = new HashSet<>();

    public Equipo() {
    }

    public Equipo(Date fechaCreacion, String localidad, String nombre, Set<Jugador> jugadors) {
        this.fechaCreacion = fechaCreacion;
        this.localidad = localidad;
        this.nombre = nombre;
        this.jugadors = jugadors;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Set<Jugador> getJugadors() {
        return jugadors;
    }

    public void setJugadors(Set<Jugador> jugadors) {
        this.jugadors = jugadors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", jugadors=" + jugadors +
                ", temporadas=" + temporadas +
                '}';
    }
}
