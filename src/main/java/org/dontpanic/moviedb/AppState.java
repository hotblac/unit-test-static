package org.dontpanic.moviedb;

import org.dontpanic.moviedb.repository.MovieRepository;
import org.dontpanic.moviedb.repository.StarRepository;

/**
 * Static singleton instances of application state objects
 */
public class AppState {

    private static MovieRepository movieRepository;
    private static StarRepository starRepository;

    public static MovieRepository getMovieRepository() {
        return movieRepository;
    }

    public static void setMovieRepository(MovieRepository movieRepository) {
        AppState.movieRepository = movieRepository;
    }

    public static StarRepository getStarRepository() {
        return starRepository;
    }

    public static void setStarRepository(StarRepository starRepository) {
        AppState.starRepository = starRepository;
    }

    static void initAppState()  {
        AppState.setMovieRepository(new MovieRepository());
        AppState.setStarRepository(new StarRepository());
    }
}
