package com.example.Service;

import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
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


    Calendar c1 = GregorianCalendar.getInstance();
    SimpleDateFormat date2 = new SimpleDateFormat("yyyy/mm/dd");

    public void testEquipo(){
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
