package org.dontpanic.moviedb;

import org.dontpanic.moviedb.entity.Movie;
import org.dontpanic.moviedb.repository.MovieRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.PrintStream;
import java.util.Set;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MovieDbTest {

    private static final Movie MOVIE_1 = new Movie("Back to the Future");
    private static final Movie MOVIE_2 = new Movie("Jaws");

    @Mock private MovieRepository movieRepository;
    @Mock private PrintStream out;
    @Captor private ArgumentCaptor<Movie> movieCaptor;
    @Captor private ArgumentCaptor<String> outCaptor;
    @InjectMocks private MovieDb db;

    @BeforeEach
    void setUp() {
        when(movieRepository.getMovies()).thenReturn(Set.of(MOVIE_1, MOVIE_2));
        AppState.movieRepository = movieRepository;
    }

    @Test
    void showMovies_loadsMoviesFromRepository() {
        db.showMovies();

        verify(out).println(MOVIE_1);
        verify(out).println(MOVIE_2);
    }
}