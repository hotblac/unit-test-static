package org.dontpanic.moviedb.repository;

import org.dontpanic.moviedb.entity.Star;

import java.util.HashSet;
import java.util.Set;

public class StarRepository {

    private final Set<Star> stars = new HashSet<>();

    public void addStar(Star star) {
        stars.add(star);
    }

    public Set<Star> getStars() {
        return stars;
    }
}
