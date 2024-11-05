package com.desafios.literalura1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafios.literalura1.model.Autor;
import com.desafios.literalura1.repository.AutorRepository;

import java.util.List;
import java.util.Optional;
@Service
public class AutorService {

    public AutorRepository autorRepository;

    @Autowired
    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public AutorService(){};

    public Optional<Autor> obtenerAutorPorNombre(String nombre){
         return autorRepository.obtenerAutorPorNombre(nombre);
    }

    public void guardarAutor(Autor autor){
        autorRepository.save(autor);
    }

    public List<Autor> obtenerTodosLosAutores(){
        return autorRepository.findAll();
    }

    public List<Autor> obtenerAutoresVivosEnAnio(int anio){
        return autorRepository.obtenerAutoresVivosEnAnio(anio);
    }

}