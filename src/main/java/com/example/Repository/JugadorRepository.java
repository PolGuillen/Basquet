package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.Date;
import java.util.List;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long>{

    public List<Jugador> findByNombreContaining(String nombre);
    public List<Jugador> findByCanastasGreaterThanEqual(int canastas);
    public List<Jugador> findByCanastasLessThanEqual(int canastas);
    public List<Jugador> findByAsistenciasBetween(int asistencias1, int asistencias2);
    public List<Jugador> findByPosicionLike(String posicion);
    public List<Jugador> findByFechaNacimientoBefore(Date fecha);
    public List<Jugador> findByCanastasGreaterThanEqualAndFechaNacimientoBefore(int canastas, Date fecha );
}
