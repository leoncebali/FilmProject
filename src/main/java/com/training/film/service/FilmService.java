package com.training.film.service;

import com.training.film.model.Film;
import com.training.film.repository.FilmRepository;
import com.training.film.util.FilmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService {
    
    @Autowired
    FilmRepository repository;

    public Film trouverParId(final Long id) throws FilmException {
        return this.repository.findById(id).orElseThrow();
    }

    public Film enregistrer(Film film) throws FilmException {
        return this.repository.save(film);
    }
}