package com.example.Repository;


import com.example.Model.Equipo;
import com.example.Model.Jugador;
import org.jboss.logging.annotations.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long>{

    public List<Equipo> findByLocalidad(String nombre);


}
