package com.example.ejercicio_java_backend_eldar;

public abstract class TarjetaFactory {

    public static TarjetaInterface construirTarjeta(MarcasTarjeta marcaTarjeta){
        return switch(marcaTarjeta){
            case AMEX -> new Amex();
            case NARA -> new Nara();
            case VISA -> new Visa();
        };
    }
}
