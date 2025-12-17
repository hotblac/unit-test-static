package org.dontpanic.moviedb.repository;

import org.dontpanic.moviedb.entity.Movie;

import java.util.HashSet;
import java.util.Set;

public class MovieRepository {

    private Set<Movie> movies = new HashSet<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public Set<Movie> getMovies() {
        return movies;
    }

}
