package com.servicio.prueba.servicioprueba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hola, Spring Boot funciona!";
    }

    @GetMapping("/saludo")
    public String saludo() {
        return "¡Hola, este es un saludo desde Spring Boot!";
    }
}
