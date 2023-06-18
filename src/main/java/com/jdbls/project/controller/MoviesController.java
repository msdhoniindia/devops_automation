package com.jdbls.project.controller;

import com.jdbls.project.entity.Movies;
import com.jdbls.project.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {

    @Autowired
    MovieService movieService;

    @GetMapping("/getMovies")
    public List<Movies> getMovies(){
        return movieService.getAllMovies();
    }
}
