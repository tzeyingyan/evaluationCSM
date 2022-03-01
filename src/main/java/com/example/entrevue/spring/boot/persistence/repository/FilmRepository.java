package com.example.entrevue.spring.boot.persistence.repository;

import com.example.entrevue.spring.boot.persistence.entite.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
}
