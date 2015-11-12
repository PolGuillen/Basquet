package com.example.Controller;

import com.example.Exception.JugadorException;
import com.example.Model.Equipo;
import com.example.Model.Jugador;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;
@RestController
@RequestMapping("/Jugador")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador){
        return jugadorRepository.save(jugador);
    }

    @RequestMapping(method = GET)
    public List<Jugador> findAll() {
        List<Jugador> jugador = new ArrayList<Jugador>();
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator();

        while (iterator.hasNext() )
            jugador.add(iterator.next());


        return jugador;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public  Jugador getById(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findOne(id);

        if(jugador == null)
            throw  new JugadorException(id);

            return jugador;

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findOne(id);

        if(jugador == null)
            throw new JugadorException(id);

        jugadorRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Jugador updateById(@PathVariable Long id, @RequestBody Jugador jugador){
        Jugador j1 = jugadorRepository.findOne(id);

        if(j1 == null)
            throw new JugadorException(id);

        return jugadorRepository.save(jugador);
    }
}