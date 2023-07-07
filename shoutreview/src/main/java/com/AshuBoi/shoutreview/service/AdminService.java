package com.AshuBoi.shoutreview.service;

import com.AshuBoi.shoutreview.domain.Movie;
import com.AshuBoi.shoutreview.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private MovieRepository movieRepository;

    //constructor injection
    public AdminService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }
}
