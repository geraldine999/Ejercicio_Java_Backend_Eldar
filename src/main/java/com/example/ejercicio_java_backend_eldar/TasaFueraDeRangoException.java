package com.example.ejercicio_java_backend_eldar;

public class TasaFueraDeRangoException extends Exception{

    TasaFueraDeRangoException(String mensaje){
        super(mensaje);
    }
}
