package com.training.film.controller;

import com.training.film.model.Film;
import com.training.film.service.FilmService;
import com.training.film.util.FilmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FilmController {

    @Autowired
    FilmService service;

    @GetMapping("/film/{id}")
    public Film filmParId(@PathVariable Long id) throws FilmException {
        return service.trouverParId(id);
    }

    @PostMapping("/film")
    public Film enregistrerFilm(@RequestBody Film film) throws FilmException {
        return service.enregistrer(film);
    }
}