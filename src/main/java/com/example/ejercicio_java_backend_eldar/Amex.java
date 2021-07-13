package com.example.ejercicio_java_backend_eldar;

import java.time.LocalDate;

public class Amex extends Tarjeta implements TarjetaInterface{
    public Amex() {
    }

    public Amex(String numeroDeTarjeta, String cardholder, LocalDate fechaDeVencimiento) {
        super(numeroDeTarjeta, cardholder, fechaDeVencimiento);
    }

    @Override
    public Double calcularTasaPorServicio() {
        Double mes= Double.valueOf(LocalDate.now().getMonthValue());
        return mes*0.1;
    }


}
