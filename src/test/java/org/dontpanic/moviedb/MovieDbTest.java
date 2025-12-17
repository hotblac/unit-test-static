package org.dontpanic.moviedb;

import org.dontpanic.moviedb.entity.Movie;
import org.dontpanic.moviedb.repository.MovieRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.PrintStream;
import java.util.Set;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MovieDbTest {

    private static final Movie MOVIE_1 = new Movie("Back to the Future");
    private static final Movie MOVIE_2 = new Movie("Jaws");

    @Mock private MovieRepository movieRepository;
    @Mock private PrintStream out;
    @Captor private ArgumentCaptor<Movie> movieCaptor;
    @Captor private ArgumentCaptor<String> outCaptor;
    @InjectMocks private MovieDb db;

    @Before
    public void setUp() {
        when(movieRepository.getMovies()).thenReturn(Set.of(MOVIE_1, MOVIE_2));
        AppState.setMovieRepository(movieRepository);
    }

    @Test
    public void showMovies_loadsMoviesFromRepository() {
        db.showMovies();

        verify(out).println(MOVIE_1);
        verify(out).println(MOVIE_2);
    }
}