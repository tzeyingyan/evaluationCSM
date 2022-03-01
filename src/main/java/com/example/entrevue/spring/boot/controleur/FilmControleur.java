package com.example.entrevue.spring.boot.controleur;

import com.example.entrevue.spring.boot.persistence.entite.Film;
import com.example.entrevue.spring.boot.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class FilmControleur {
    @Autowired
    FilmService filmService;

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/film",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<Film> ajouterFilm(@RequestBody Film film) {
        return new ResponseEntity(filmService.ajouterFilm(film), HttpStatus.CREATED);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/film/{identifiant}",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<String> retournerFilm(@PathVariable("identifiant") Long identifiant) {
        return new ResponseEntity(filmService.retournerFilm(identifiant), HttpStatus.OK);
    }


}
