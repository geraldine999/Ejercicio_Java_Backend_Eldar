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

    public static Double calcularTasaDeOperacion(MarcasTarjeta marca, Double importe ) {
        //instancio una tarjeta segun la marca
        TarjetaInterface tarjeta = TarjetaFactory.construirTarjeta(marca);
        //primero me fijo si la operacion es valida segun el importe
        if (Operacion.operacionEsValida(importe)) {
            //si es valida calculo la tasa, que depende de la marca de la tarjeta
            Double tasa = tarjeta.calcularTasaPorServicio();
            //verifico si la tasa se ajusta al rango
            try {
                verificarRangoDeTasa(tasa);
            } catch (Exception e){
                return null;
            }
            return tasa;
        }
        return null;
    }

     static void verificarRangoDeTasa(Double tasa) throws TasaFueraDeRangoException {
        //segun consigna: Cada marca tiene un modo de calcular una tasa por el servicio que es desde 0.3% hasta 5%,
        if(tasa<0.3 || tasa>5.0){
            throw new TasaFueraDeRangoException("Tasa fuera de rango aceptable. Consulte con el banco");
        }
     }
    }
