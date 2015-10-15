package com.example.Model;
import javax.persistence.*;
import java.util.Date;


@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    protected Long id;


    protected String nombre;


    protected Date fechaNacimiento;


    private int canastas;


    private int asistencias;


    private int rebotes;


    private String posicion;

    public Jugador() {
    }



    public Jugador(String nombre, String posicion, int asistencias, int canastas, Date fechaNacimiento, int rebotes) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.asistencias = asistencias;
        this.canastas = canastas;
        this.fechaNacimiento = fechaNacimiento;
        this.rebotes = rebotes;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {

        this.fechaNacimiento =fechaNacimiento;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }

    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", canastas=" + canastas +
                ", asistencias=" + asistencias +
                ", rebotes=" + rebotes +
                ", posicion=" + posicion +
                '}';
    }
}
