package com.example;

import com.example.Service.EquipoService;
import com.example.Service.JugadorService;
import com.example.Service.LigaService;
import com.example.Service.TemporadaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBasquetApplication {
    public static JugadorService jugadorService;
    public static EquipoService equipoService;
    public static TemporadaService temporadaService;
    public static LigaService ligaService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaBasquetApplication.class, args);
        temporadaService=context.getBean(TemporadaService.class);
        temporadaService.testTemporadas();
        equipoService=context.getBean(EquipoService.class);
        equipoService.testEquipo();
        jugadorService = context.getBean(JugadorService.class);
        jugadorService.testJugador();


        ligaService=context.getBean(LigaService.class);
        ligaService.testLiga();
        equipoService.ejercicio2();
    }
}
