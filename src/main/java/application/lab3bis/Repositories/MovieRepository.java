package application.lab3bis.Repositories;

import application.lab3bis.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
    List<Movie> findMoviesByTitleContaining(String title);
}
