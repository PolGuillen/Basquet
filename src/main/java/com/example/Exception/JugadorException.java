package com.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class JugadorException extends  RuntimeException{

    public JugadorException(Long id){
        super("Jugador con id: "+ id+ " no existe.");
    }


}
