package com.example.ejercicio_java_backend_eldar;

import java.time.LocalDate;

public class Visa extends Tarjeta implements TarjetaInterface{

    public Visa() {
    }

    public Visa(String numeroDeTarjeta, String cardholder, LocalDate fechaDeVencimiento) {
        super(numeroDeTarjeta, cardholder, fechaDeVencimiento);
    }

    @Override
    public Double calcularTasaPorServicio() {
        int anio = LocalDate.now().getYear()-2000;
        int mes= LocalDate.now().getMonthValue();
        return Double.valueOf(anio/mes);
    }


}
