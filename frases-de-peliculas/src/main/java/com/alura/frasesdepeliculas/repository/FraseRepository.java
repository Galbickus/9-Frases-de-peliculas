package com.alura.frasesdepeliculas.repository;

import com.alura.frasesdepeliculas.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    public Frase obtenerFraseAleatoria();
}
