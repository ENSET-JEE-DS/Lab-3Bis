package application.lab3bis.DTOs;

import application.lab3bis.Models.Movie;
import application.lab3bis.Repositories.MovieRepository;

public class MovieMapper {
    public MovieDTO movieToDTO(Movie movie) {
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setId(movie.getId());
        movieDTO.setTitle(movie.getTitle());
        return movieDTO;
    }

    public Movie movieDTOToMovie(MovieRepository movieRepository, MovieDTO movieDTO) {
        return movieRepository.findById(movieDTO.getId()).orElse(null);
    }
}
