package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
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


    @Query("SELECT j FROM Jugador j WHERE j.equipo.nombre = :nombre ")
    public List<Jugador> findByNombre(@Param("nombre") String nombre);

    @Query("SELECT j FROM Jugador j WHERE j.equipo.nombre = :nombre and j.posicion = :posicion")
    public List<Jugador> findByNombreAndPosicion(@Param("nombre") String nombre, @Param("posicion") String posicion);


    public List<Jugador> findFirstByOrderByCanastasDesc();

    public List<Jugador> findFirst5ByOrderByAsistenciasDesc();

    @Query("SELECT j FROM Jugador j WHERE j.equipo.nombre = :nombre order by j.canastas desc ")
    public List<Jugador> findFirstByOrderByCanastasDesc(@Param("nombre") String nombre);
}
