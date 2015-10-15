package com.example.Model;
    import javax.persistence.*;
    import java.util.Date;

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;


}
