package com.example.Controller;

import com.example.Exception.EquipoException;
import com.example.Model.Equipo;
import com.example.Model.Jugador;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import static org.springframework.web.bind.annotation.RequestMethod.*;
@RestController
@RequestMapping("/Equipo")
public class EquipoController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Equipo save(@RequestBody Equipo equipo){
        return equipoRepository.save(equipo);
    }

    @RequestMapping(method = GET)
    public List<Equipo> findAll() {
        List<Equipo> equipo = new ArrayList<Equipo>();
        Iterator<Equipo> iterator = equipoRepository.findAll().iterator();

        while (iterator.hasNext() )
            equipo.add(iterator.next());


        return equipo;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public  Equipo getById(@PathVariable Long id){
        Equipo equipo = equipoRepository.findOne(id);

        if(equipo == null)
            throw  new EquipoException(id);

        return equipo;

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id){
        Equipo equipo = equipoRepository.findOne(id);

        if(equipo == null)
            throw new EquipoException(id);

        equipoRepository.delete(id);
    }

    @RequestMapping(value = "/{idEquipo}/equipo/{idJugador}", method = POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Equipo addJugador(@PathVariable Long idEquipo, @RequestBody Equipo equipo) {
        if(equipoRepository.findOne(idEquipo) == null)
            throw new EquipoException(idEquipo);

        return equipoRepository.save(equipo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Equipo updateById(@PathVariable Long id, @RequestBody Equipo equipo){
        Equipo e1 = equipoRepository.findOne(id);

        if(e1 == null)
            throw new EquipoException(id);

        return equipoRepository.save(equipo);
    }
}