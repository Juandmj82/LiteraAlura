package com.desafios.literalura1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.desafios.literalura1.model.Idioma;
import com.desafios.literalura1.model.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro,Long> {
    @Query("SELECT l FROM Libro l WHERE LOWER(l.titulo) LIKE LOWER(:nombre)")
    Optional<Libro> obtenerLibroPorNombre(String nombre);

    @Query("SELECT l FROM Libro l WHERE l.idioma=:idioma")
    List<Libro> obtenerLibrosPorIdioma(Idioma idioma);
}