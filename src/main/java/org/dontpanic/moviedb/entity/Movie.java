package org.dontpanic.moviedb.entity;

import java.util.HashSet;
import java.util.Set;

public class Movie {

    private String title;
    private Set<Star> stars = new HashSet<>();

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Star> getStars() {
        return stars;
    }

    public void addStar(Star star) {
        stars.add(star);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", stars=" + stars +
                '}';
    }
}
