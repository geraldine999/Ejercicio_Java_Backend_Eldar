package com.example.ejercicio_java_backend_eldar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class EjercicioJavaBackendEldarApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjercicioJavaBackendEldarApplication.class, args);

        //TODO cuales excepciones??
        //TODO separar en carpetas?



        // 1) Crear una clase ejecutable con 3 objetos que haga lo siguiente:
        //Invocar un método que devuelva toda la información de una tarjeta
        //Informar si una operación es valida--
        //Informar si una tarjeta es válida para operar--
        //Identificar si una tarjeta es distinta a otra--
        //Obtener por medio de un método la tasa de una operación informando marca e importe
        //IMPORTANTE: Realizar el correspondiente manejo de excepciones en casos de error.


        //1) Crear una clase ejecutable con 3 objetos que haga lo siguiente:
        Amex tarjeta1 = new Amex("023687900", "Lucas Gutierrez", LocalDate.of(2019,05,01));
        Nara tarjeta2 = new Nara("895623459", "Juan Perez", LocalDate.of(2025, 04,01));
        Visa tarjeta3 = new Visa("897654679", "Natalia Rodriguez", LocalDate.of(2022, 03, 01));

        //Invocar un método que devuelva toda la información de una tarjeta
        System.out.println(tarjeta1.toString());
        System.out.println(tarjeta2.toString());
        System.out.println(tarjeta3.toString());

        //Informar si una operación es valida--
        System.out.println(Operacion.operacionValida(5000.00));
        System.out.println(Operacion.operacionValida(800.00));
        System.out.println(Operacion.operacionValida(1000.00));

        //Informar si una tarjeta es válida para operar--
        System.out.println(tarjeta1.tarjetaValida());
        System.out.println(tarjeta2.tarjetaValida());
        System.out.println(tarjeta3.tarjetaValida());

        //Identificar si una tarjeta es distinta a otra--
        System.out.println(tarjeta1.equals(tarjeta2));

        //Obtener por medio de un método la tasa de una operación informando marca e importe
        System.out.println(Operacion.calcularTasaDeOperacion(MarcasTarjeta.VISA, 800.00));
        System.out.println(Operacion.calcularTasaDeOperacion(MarcasTarjeta.AMEX, 5000.00));//esta operacion no es valida porque el importe es > 1000.00, por lo tanto, da null
        System.out.println(Operacion.calcularTasaDeOperacion(MarcasTarjeta.NARA, 200.00));



    }



}
