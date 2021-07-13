package com.example.ejercicio_java_backend_eldar;

public class Response {
    private Double tasa;

    public Response() {
    }

    public Response(Double tasa) {
        this.tasa = tasa;
    }

    public Double getTasa() {
        return tasa;
    }

    public void setTasa(Double tasa) {
        this.tasa = tasa;
    }
}
