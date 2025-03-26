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

//            movieRepository.save(new Movie(
//                    null,                   // id will be auto-generated
//                    "GoodFellas",           // title
//                    "Martin Scorsese",      // director
//                    1990,                   // releaseYear
//                    "Crime Drama",          // genre
//                    "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate.", // description
//                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ23JwU8vZ4uybP_2-2yETpN4o4Jis0Ew_QZK8YOeB3sEpHRKN" // img_url
//            ));
//
//            movieRepository.save(new Movie(
//                    null,                   // id will be auto-generated
//                    "Spirited Away",        // title
//                    "Hayao Miyazaki",       // director
//                    2001,                   // releaseYear
//                    "Animated Fantasy",     // genre
//                    "During her family's move to the suburbs, a sullen 10-year-old girl wanders into a world ruled by gods, witches, and spirits, and where humans are changed into beasts.", // description
//                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSUhcxBy7msWBIrxRvKnczoXV61Vd6kqP5H2Kh3m2U8MMG15JIj" // img_url
//            ));
//
//            movieRepository.save(new Movie(
//                    null,                   // id will be auto-generated
//                    "12 Angry Men",         // title
//                    "Sidney Lumet",         // director
//                    1957,                   // releaseYear
//                    "Drama",                // genre
//                    "A jury holdout attempts to prevent a miscarriage of justice by forcing his colleagues to reconsider the evidence.", // description
//                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAJZnplMwjCtHf_SAhxWLTDEoVWunMNp53CemNoORRZQtxI-3tYSUYk1hLb_jBwgvxFXMQ" // img_url
//            ));
//
//            movieRepository.save(new Movie(
//                    null,                   // id will be auto-generated
//                    "The Godfather",        // title
//                    "Francis Ford Coppola", // director
//                    1972,                   // releaseYear
//                    "Crime Drama",          // genre
//                    "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.", // description
//                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTWmKJlXjXTiE9hkekFBy9WCRMf0eKZx2mrsgenlO-qzr9H7v0A" // img_url
//            ));
//
//            // Groundbreaking Postmodern Crime Film
//            movieRepository.save(new Movie(
//                    null,                   // id will be auto-generated
//                    "Pulp Fiction",         // title
//                    "Quentin Tarantino",    // director
//                    1994,                   // releaseYear
//                    "Crime Drama",          // genre
//                    "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", // description
//                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTj6_ot-pRVfLMtc2vyguVf_0m0HUuvdBw2I-EuFXkUIEB_eoAS" // img_url
//            ));
//
//            // Inspirational Prison Drama
//            movieRepository.save(new Movie(
//                    null,                   // id will be auto-generated
//                    "The Shawshank Redemption", // title
//                    "Frank Darabont",       // director
//                    1994,                   // releaseYear
//                    "Drama",                // genre
//                    "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", // description
//                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRipfEoI8fb4qxidki3e_kp3fr_Kopvoi2yCKcpJGf2ngnKweMR" // img_url
//            ));
        };
    }
}
