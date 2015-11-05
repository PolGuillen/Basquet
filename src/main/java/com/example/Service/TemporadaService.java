package com.example.Service;


import com.example.Model.Temporada;
import com.example.Repository.EquipoRepository;
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
public class TemporadaService  {

    @Autowired
    private TemporadaRepository temporadaRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void testTemporadas(){
        Calendar c1 = GregorianCalendar.getInstance();
        SimpleDateFormat date2 = new SimpleDateFormat("yyyy");

        Temporada temporada1 = new Temporada();
        c1.set(2000, 01, 01);
        Date creacion =c1.getTime();
        temporada1.setYear(creacion);

        temporadaRepository.save(temporada1);

        Temporada temporada2 = new Temporada();
        c1.set(2001, 01, 01);
        creacion =c1.getTime();
        temporada2.setYear(creacion);
        temporadaRepository.save(temporada2);
    }
}
