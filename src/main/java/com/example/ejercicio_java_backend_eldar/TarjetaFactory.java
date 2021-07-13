package com.example.ejercicio_java_backend_eldar;

public abstract class TarjetaFactory {

    public static TarjetaInterface construirTarjeta(MarcasTarjeta marcaTarjeta){
        switch(marcaTarjeta){
            case AMEX ->{return new Amex();}
            case NARA -> {return new Nara();}
            case VISA -> {return new Visa();}
            default -> {return null;}
        }
    }
}
