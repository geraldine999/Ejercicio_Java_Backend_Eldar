package com.example.ejercicio_java_backend_eldar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("consulta")
public class OperacionController {
//2) Implementar una API REST, que responda y reciba en formato JSON, que permita
//consultar la tasa de una operación, informando marca de la tarjeta e importe.
//Hostear solución en algún cloud computing libre e indicar URL
//IMPORTANTE: Compartir código en GIT con la solución de ambos ejercicios
    //TODO esta bien utilizar post??
    //TODO validaciones?? que se espere un string o double
    //TODO hace falta response o puedo devolver la tasa de una tarjeta?


    @PostMapping(produces = "application/json")
    @ResponseBody
    public Response consultarTasaDeOperacion(@RequestBody Operacion operacion){
        String marca= operacion.getMarca().toUpperCase(Locale.ROOT);
        Double importe = operacion.getImporte();
        MarcasTarjeta marcaTarjeta= MarcasTarjeta.valueOf(marca);
        return new Response(Operacion.calcularTasaDeOperacion(marcaTarjeta, importe));
        }

    }


