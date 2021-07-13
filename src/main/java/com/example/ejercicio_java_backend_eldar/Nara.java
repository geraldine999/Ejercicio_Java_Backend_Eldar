package com.example.ejercicio_java_backend_eldar;

import java.time.LocalDate;

public class Nara extends Tarjeta implements TarjetaInterface{

    public Nara() {
    }

    public Nara(String numeroDeTarjeta, String cardholder, LocalDate fechaDeVencimiento) {
        super(numeroDeTarjeta, cardholder, fechaDeVencimiento);
    }

    @Override
    public Double calcularTasaPorServicio() {
        Double dia = Double.valueOf(LocalDate.now().getDayOfMonth());
        return dia*0.5;

    }


}
