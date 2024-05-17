package com.alura.frasesdepeliculas.service;

import com.alura.frasesdepeliculas.dto.FraseDTO;
import com.alura.frasesdepeliculas.model.Frase;
import com.alura.frasesdepeliculas.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;
    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonaje(),frase.getPoster());
    }
}
