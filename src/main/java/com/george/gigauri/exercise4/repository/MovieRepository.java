package com.george.gigauri.exercise4.repository;

import com.george.gigauri.exercise4.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Movie getById(long id);

    void deleteById(long id);
}
