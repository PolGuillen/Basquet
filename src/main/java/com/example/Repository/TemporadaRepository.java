package com.example.Repository;



import com.example.Model.Jugador;
import com.example.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TemporadaRepository extends PagingAndSortingRepository<Temporada, Long> {
    public Temporada findById(Long id);

}
