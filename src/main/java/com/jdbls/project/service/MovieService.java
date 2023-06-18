package com.jdbls.project.service;

import com.jdbls.project.entity.Movies;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    public List<Movies> getAllMovies() {
        List<Movies> moviesList = Arrays.asList(new Movies("KHNH", "2006", 4, "HIT"));
        return moviesList;

    }
}
