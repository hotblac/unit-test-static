package org.dontpanic.moviedb;

import org.dontpanic.moviedb.entity.Movie;
import org.dontpanic.moviedb.entity.Star;
import org.dontpanic.moviedb.repository.MovieRepository;

public class MovieDb {
    public static void main(String[] args) {
        AppState.initAppState();

        MovieDb db = new MovieDb();
        db.loadMovies();
        db.showMovies();
    }

    public void loadMovies() {
        Star aykroyd = new Star("Dan Aykroyd");
        Star bellushi = new Star("John Bellushi");
        Star hudson = new Star("Ernie Hudson");
        Star murray = new Star("Bill Murray");
        Star ramis  = new Star("Harold Ramis");

        Movie ghostbusters = new Movie("Ghostbusters");
        ghostbusters.addStar(aykroyd);
        ghostbusters.addStar(hudson);
        ghostbusters.addStar(murray);
        ghostbusters.addStar(ramis);

        Movie bluesBrothers = new Movie("Blues Brothers");
        bluesBrothers.addStar(aykroyd);
        bluesBrothers.addStar(bellushi);

        MovieRepository movieRepository = AppState.getMovieRepository();
        movieRepository.addMovie(ghostbusters);
        movieRepository.addMovie(bluesBrothers);
    }

    public void showMovies() {
        MovieRepository movieRepository = AppState.getMovieRepository();
        movieRepository.getMovies().forEach(System.out::println);
    }

}