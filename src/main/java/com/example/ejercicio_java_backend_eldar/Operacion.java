package com.example.ejercicio_java_backend_eldar;

public class Operacion {
    private String marca;
    private Double importe;

    public Operacion() {
    }

    public Operacion(String marca, Double importe) {
        this.marca = marca;
        this.importe = importe;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public static Boolean operacionEsValida(Double importe){
        return importe<1000.00;
    }

    public static Double calcularTasaDeOperacion(MarcasTarjeta marca, Double importe ){
        //instancio una tarjeta segun la marca
        TarjetaInterface tarjeta = TarjetaFactory.construirTarjeta(marca);
        //primero valido si la operacion es valida segun el importe
        if (Operacion.operacionEsValida(importe)) {
            //si es valida devuelvo la tasa, que depende de la marca de la tarjeta
            return tarjeta.calcularTasaPorServicio();
        }
        return null;
    }
}
