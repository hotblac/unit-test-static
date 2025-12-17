package org.dontpanic.moviedb.entity;

import java.util.HashSet;
import java.util.Set;

public class Star {

    private String name;
    private Set<Movie> movies = new HashSet<>();

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                '}';
    }
}
