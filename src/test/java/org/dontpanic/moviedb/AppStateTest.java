package org.dontpanic.moviedb;

import org.dontpanic.moviedb.repository.MovieRepository;
import org.dontpanic.moviedb.repository.StarRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppStateTest {

    @Test
    void initAppState_inititializesRepositories() {
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