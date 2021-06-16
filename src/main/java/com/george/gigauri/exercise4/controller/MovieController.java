package com.george.gigauri.exercise4.controller;

import com.george.gigauri.exercise4.model.Movie;
import com.george.gigauri.exercise4.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    @GetMapping("/movies/{id}")
    public Movie getMovie(@PathVariable("id") long id) {
        return movieRepository.getById(id);
    }

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @DeleteMapping("/movies")
    public void deleteAll() {
        movieRepository.deleteAll();
    }

    @DeleteMapping("/movies/{id}")
    public void delete(@PathVariable("id") long id) {
        movieRepository.deleteById(id);
    }
}
