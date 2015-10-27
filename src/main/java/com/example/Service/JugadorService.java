package com.example.Service;

import com.example.Model.Jugador;
import com.example.Model.Equipo;
import com.example.Repository.JugadorRepository;
import com.example.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
@Transactional
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    Calendar c1 =GregorianCalendar.getInstance();
    SimpleDateFormat date2 = new SimpleDateFormat("yyyy/mm/dd");

    public void testJugador(){

        Equipo equipo1 = new Equipo();
        c1.set(2000, 12, 31);
        Date creacion =c1.getTime();
        equipo1.setNombre("Team123");
        equipo1.setFechaCreacion(creacion);
        equipo1.setLocalidad("Aqui");
        equipoRepository.save(equipo1);

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Juan");
        c1.set(2000, 12, 31);
        Date nacimiento =c1.getTime();
        jugador1.setFechaNacimiento(nacimiento);
        jugador1.setCanastas(9);
        jugador1.setAsistencias(26);
        jugador1.setRebotes(13);
        jugador1.setPosicion("Pivot");
        jugador1.setEquipo(equipo1);
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Victor");
        c1.set(1995, 8, 31);
         nacimiento =c1.getTime();
        jugador2.setFechaNacimiento(nacimiento);
        jugador2.setCanastas(0);
        jugador2.setAsistencias(26);
        jugador2.setRebotes(13);
        jugador2.setPosicion("Pivot");
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Alex");
        c1.set(1995, 01, 31);
         nacimiento =c1.getTime();
        jugador3.setFechaNacimiento(nacimiento);
        jugador3.setCanastas(0);
        jugador3.setAsistencias(26);
        jugador3.setRebotes(13);
        jugador3.setPosicion("Pivot");
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Maria");
        c1.set(2003, 05, 05);
         nacimiento =c1.getTime();
        jugador4.setFechaNacimiento(nacimiento);
        jugador4.setCanastas(0);
        jugador4.setAsistencias(26);
        jugador4.setRebotes(13);
        jugador4.setPosicion("Pivot");
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Pepe");
        c1.set(1999, 06, 11);
        nacimiento =c1.getTime();
        jugador5.setFechaNacimiento(nacimiento);
        jugador5.setCanastas(0);
        jugador5.setAsistencias(11);
        jugador5.setRebotes(13);
        jugador5.setPosicion("Pivot");
        jugadorRepository.save(jugador5);


        System.out.println("jugador1" + jugador1);
        System.out.println("jugador2" + jugador2);
        System.out.println("jugador3" + jugador3);
        System.out.println("jugador4" + jugador4);
        System.out.println("jugador5" + jugador5);

        System.out.println(jugadorRepository.findByNombreContaining("Juan"));
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(5));
        System.out.println(jugadorRepository.findByCanastasLessThanEqual(9));
        System.out.println(jugadorRepository.findByAsistenciasBetween(10, 12));
        System.out.println(jugadorRepository.findByPosicionLike("Pivot"));

        c1.set(2003, 05, 05);
        Date findNacimiento =c1.getTime();
        System.out.println(jugadorRepository.findByFechaNacimientoBefore(findNacimiento));
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqualAndFechaNacimientoBefore(22, findNacimiento));
    }



}
