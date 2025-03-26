package application.lab3bis.Controllers;

import application.lab3bis.Exceptions.MovieExceptions.MovieNotFoundException;
import application.lab3bis.Models.Movie;
import application.lab3bis.Repositories.MovieRepository;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
@AllArgsConstructor
public class MovieController {

    MovieRepository movieRepository;

    @GetMapping
    public String getAllMovies(Model model) {
        List<Movie> movieList = movieRepository.findAll();
        model.addAttribute("movies", movieList);
        return "movies";
    }

    @GetMapping("/{id}")
    public String getMovie(Model model, @PathVariable String id) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie not found in the Database."));
        model.addAttribute("movie", movie);
        return "movie";
    }


}
