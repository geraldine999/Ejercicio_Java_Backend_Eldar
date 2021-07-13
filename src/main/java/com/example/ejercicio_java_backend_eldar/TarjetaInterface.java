package com.example.ejercicio_java_backend_eldar;

public interface TarjetaInterface {
     default Double validarTasaPorServicio(){
     Double tasa = calcularTasaPorServicio();
          if(tasa < 0.3){
               return 0.3;
          }
          if(tasa>5.0){
               return 5.0;
          }
          return tasa;}


     Double calcularTasaPorServicio();
}


