package application.lab3bis;

import application.lab3bis.Assets.SampleMovieData;
import application.lab3bis.Models.Movie;
import application.lab3bis.Repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Lab3bisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab3bisApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(MovieRepository movieRepository) {
        return args -> {
//            movieRepository.saveAll(SampleMovieData.getSampleMovies());
        };
    }
}
