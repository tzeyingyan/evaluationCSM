package com.example.entrevue.spring.boot.service;

import com.example.entrevue.spring.boot.persistence.entite.Film;
import com.example.entrevue.spring.boot.persistence.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FilmService {
    @Autowired
    FilmRepository filmRepository;

    public Film ajouterFilm(Film film) {
        return filmRepository.saveAndFlush(film);
    }

    public Film retournerFilm(Long id) {
        return Optional.ofNullable(filmRepository.findById(id))
                .get()
                .orElse(null);
    }
}