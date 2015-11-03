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
        jugadorService = context.getBean(JugadorService.class);
        jugadorService.testJugador();
        equipoService=context.getBean(EquipoService.class);
        equipoService.testEquipo();
        temporadaService=context.getBean(TemporadaService.class);
        temporadaService.testTemporadas();
        ligaService=context.getBean(LigaService.class);
        ligaService.testLiga();
    }
}
