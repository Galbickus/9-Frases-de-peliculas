package com.alura.frasesdepeliculas.controller;

import com.alura.frasesdepeliculas.dto.FraseDTO;
import com.alura.frasesdepeliculas.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFrases(){
        return service.obtenerFraseAleatoria();
    }
}
/*localhost:8080/series/frases:1 */