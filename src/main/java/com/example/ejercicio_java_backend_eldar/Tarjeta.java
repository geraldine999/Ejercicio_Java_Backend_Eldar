package com.example.ejercicio_java_backend_eldar;

import java.time.LocalDate;


public abstract class Tarjeta implements TarjetaInterface {
    private String numeroDeTarjeta;
    private String cardholder;
    private LocalDate fechaDeVencimiento;

    public Tarjeta() {
    }

    public Tarjeta( String numeroDeTarjeta, String cardholder, LocalDate fechaDeVencimiento) {
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.cardholder = cardholder;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }



    @Override
    public String toString() {
        return "Tarjeta{" +
                "marca=" + informarMarca() +
                ", numeroDeTarjeta='" + numeroDeTarjeta + '\'' +
                ", cardholder='" + cardholder + '\'' +
                ", fechaDeVencimiento=" + fechaDeVencimiento +
                '}';
    }


    public String getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(String numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public LocalDate getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    //---------------------------------

    public Boolean tarjetaEsValida(){
        LocalDate hoy = LocalDate.now();
        return hoy.isBefore(fechaDeVencimiento);
    }


    public String informarMarca() {
        return this.getClass().getSimpleName();
    }









}
