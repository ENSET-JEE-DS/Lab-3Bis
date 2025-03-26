package application.lab3bis.Controllers;

import application.lab3bis.Exceptions.MovieExceptions.MovieNotFoundException;
import application.lab3bis.Models.Movie;
import application.lab3bis.Repositories.MovieRepository;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/add")
    public String addMovie(Model model) {
        model.addAttribute("movie", new Movie());
        model.addAttribute("operation", "add");
        return "movieForm";
    }

    @PostMapping("/add")
    public String addMovie(@ModelAttribute Movie movie) {
        System.out.println("Item that need to be added:");
        System.out.println(movie);
        movieRepository.save(movie);
        System.out.println("Item added successfully");
        return "redirect:/movies";
    }

//    @PostMapping("/{id}/edit")
//    public String editMovie(@PathVariable String id, @ModelAttribute Movie movie) {
//        movie.setId(id);
//        movieRepository.save(movie);
//        return "redirect:/movies/" + id;
//    }


}
