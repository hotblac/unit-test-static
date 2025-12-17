package org.dontpanic.moviedb;

import org.dontpanic.moviedb.repository.MovieRepository;
import org.dontpanic.moviedb.repository.StarRepository;

/**
 * Static singleton instances of application state objects
 */
public class AppState {

    static MovieRepository movieRepository;
    static StarRepository starRepository;

    static {
        AppState.movieRepository = new MovieRepository();
        AppState.starRepository = new StarRepository();
    }

    public static MovieRepository getMovieRepository() {
        return movieRepository;
    }

    public static StarRepository getStarRepository() {
        return starRepository;
    }
}
