package com.example.Service;

import com.example.Model.Equipo;
import com.example.Model.Temporada;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
@Transactional
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;


    Calendar c1 = GregorianCalendar.getInstance();
    SimpleDateFormat date2 = new SimpleDateFormat("yyyy/mm/dd");

    public void testEquipo(){

        Temporada temporada1 = temporadaRepository.findById(1L);
        Temporada temporada2 = temporadaRepository.findById(2L);

        Equipo equipo1 = new Equipo();
        c1.set(2000, 12, 31);
        Date creacion = c1.getTime();
        equipo1.setNombre("Team123");
        equipo1.setFechaCreacion(creacion);
        equipo1.setLocalidad("Aqui");
        equipo1.getTemporadas().add(temporada1);
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        c1.set(2000, 12, 31);
        creacion = c1.getTime();
        equipo2.setNombre("TeamABC");
        equipo2.setFechaCreacion(creacion);
        equipo2.setLocalidad("Alli");
        equipo2.getTemporadas().add(temporada1);
        equipo2.getTemporadas().add(temporada2);
        equipoRepository.save(equipo2);




    }

    public void ejercicio2() {

        System.out.println("AAA");
        System.out.println(jugadorRepository.findByNombre("Team123"));
        System.out.println("AAA");
        System.out.println("AAA");
        System.out.println(jugadorRepository.findByNombreAndPosicion("Team123", "Alero"));
        System.out.println("AAA");
        System.out.println("EEE");
        System.out.println(jugadorRepository.findFirstByOrderByCanastasDesc("Team123").get(0));
        System.out.println("EEE");
    }
}
