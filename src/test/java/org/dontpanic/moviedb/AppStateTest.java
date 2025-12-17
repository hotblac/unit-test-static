package org.dontpanic.moviedb;

import org.dontpanic.moviedb.repository.MovieRepository;
import org.dontpanic.moviedb.repository.StarRepository;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AppStateTest {

    @Test
    public void initAppState_inititializesRepositories() {
        MovieRepository movieRepository = AppState.getMovieRepository();
        StarRepository starRepository = AppState.getStarRepository();

        // Repositories are initialized
        assertNotNull(movieRepository);
        assertNotNull(starRepository);

        // Initial repository state is empty
        assertTrue(movieRepository.getMovies().isEmpty());
        assertTrue(starRepository.getStars().isEmpty());
    }
}