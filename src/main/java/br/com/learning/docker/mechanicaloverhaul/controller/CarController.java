package br.com.learning.docker.mechanicaloverhaul.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author macrusal on 08/09/19
 * @project mechanical_overhaul
 */
@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String getCars(){
        return "Retorno do metodo getCar - HTTP GET";
    }

    @PostMapping
    public String createCar(){
        return "Retorno do metodo createCar - HTTP POST";
    }

    @PutMapping
    public String updateCar(){
        return "Retorno do metodo updateCar - HTTP PUT";
    }

    @DeleteMapping
    public String deleteCar(){
        return "Retorno do metodo deleteCar - HTTP DELETE";
    }
}
