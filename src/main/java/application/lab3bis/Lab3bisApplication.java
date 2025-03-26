package application.lab3bis;

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

//            movieRepository.save(new Movie(null, "GoodFellas", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ23JwU8vZ4uybP_2-2yETpN4o4Jis0Ew_QZK8YOeB3sEpHRKN"));
//            movieRepository.save(new Movie(null, "Spirited Away", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSUhcxBy7msWBIrxRvKnczoXV61Vd6kqP5H2Kh3m2U8MMG15JIj"));
//            movieRepository.save(new Movie(null, "12 Angry Men ", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAJZnplMwjCtHf_SAhxWLTDEoVWunMNp53CemNoORRZQtxI-3tYSUYk1hLb_jBwgvxFXMQ"));
        };
    }
}
