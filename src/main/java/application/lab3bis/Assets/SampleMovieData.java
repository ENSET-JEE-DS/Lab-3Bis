package application.lab3bis.Assets;

import application.lab3bis.Models.Movie;

import java.util.ArrayList;
import java.util.List;

public class SampleMovieData {
    public static List<Movie> getSampleMovies() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(
                null,
                "Shrek 2",
                "Andrew Adamson, Conrad Vernon, Kelly Asbury",
                2004,
                "Family/Comedy ",
                "When Shrek and Fiona return from their honeymoon, her parents, the rulers of Far Far Away, invite them over. But as the king does not like Shrek, he enlists a fairy to keep him away from his daughter.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4n3sD6-WAtiOYl5ZFlcXbGncWMBsNkqgkc8C0Nn6pgKi0IcCp"
        ));


        movieList.add(new Movie(
                null,
                "Taxi Driver",
                "Martin Scorsese",
                1976,
                "Crime/Noir",
                "Travis, an ex-marine and Vietnam veteran, works as a taxi driver in New York City. One day, he decides to save an underage prostitute from her pimp in an effort to clean the city of its corruption.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjDowcGhxm4omvaqPavlSwnf5ClE-Ten6b4FcTy_3i3z37jx_g"
        ));

        movieList.add(new Movie(
                null,
                "The Shining",
                "Stanley Kubrick",
                1980,
                "Horror/Mystery",
                "Jack Torrance is a winter caretaker at the Overlook Hotel. He lives there with his wife Wendy and son Danny. However, things take a turn when Danny and his family start witnessing supernatural events.",
                "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcR38YWKNniX03S3nPtHxLi2k3l8Oa5aolYx1dfcmioUZ_JQ21_G"
        ));

        movieList.add(new Movie(
                null,
                "GoodFellas",
                "Martin Scorsese",
                1990,
                "Crime Drama",
                "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ23JwU8vZ4uybP_2-2yETpN4o4Jis0Ew_QZK8YOeB3sEpHRKN"
        ));

        movieList.add(new Movie(
                null,
                "Spirited Away",
                "Hayao Miyazaki",
                2001,
                "Animated Fantasy",
                "During her family's move to the suburbs, a sullen 10-year-old girl wanders into a world ruled by gods, witches, and spirits, and where humans are changed into beasts.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSUhcxBy7msWBIrxRvKnczoXV61Vd6kqP5H2Kh3m2U8MMG15JIj"
        ));

        movieList.add(new Movie(null,
                "12 Angry Men",
                "Sidney Lumet",
                1957,
                "Drama",
                "A jury holdout attempts to prevent a miscarriage of justice by forcing his colleagues to reconsider the evidence.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAJZnplMwjCtHf_SAhxWLTDEoVWunMNp53CemNoORRZQtxI-3tYSUYk1hLb_jBwgvxFXMQ"
        ));

        movieList.add(
                new Movie(
                        null,
                        "The Godfather",
                        "Francis Ford Coppola",
                        1972,
                        "Crime Drama",
                        "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTWmKJlXjXTiE9hkekFBy9WCRMf0eKZx2mrsgenlO-qzr9H7v0A"
                )
        );

        movieList.add(new Movie(null,
                "Pulp Fiction",
                "Quentin Tarantino",
                1994,
                "Crime Drama",
                "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTj6_ot-pRVfLMtc2vyguVf_0m0HUuvdBw2I-EuFXkUIEB_eoAS"
        ));
        movieList.add(new Movie(
                null,
                "The Shawshank Redemption",
                "Frank Darabont",
                1994,
                "Drama",
                "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
                "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRipfEoI8fb4qxidki3e_kp3fr_Kopvoi2yCKcpJGf2ngnKweMR"
        ));
        return movieList;
    }
}


//
//            ));
