package com.example.Service;

import com.example.Model.Liga;
import com.example.Model.Temporada;
import com.example.Repository.LigaRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;


@Service
@Transactional
public class LigaService {

    @Autowired
        private LigaRepository ligaRepository;

    @Autowired
        private TemporadaRepository temporadaRepository;

    public void testLiga(){
        Liga liga1 = new Liga();

        Temporada temporada1 = temporadaRepository.findById(2L);

        liga1.setNombre("ACB");
        liga1.getTemporadas().add(temporada1);
        ligaRepository.save(liga1);



        System.out.println("");
        System.out.println("");
        System.out.println(liga1.getTemporadas());
        System.out.println("");
    }
}
