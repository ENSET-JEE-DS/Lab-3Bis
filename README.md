# Lab-3bis Movie Collection Application

This project is a Spring Boot application for managing a collection of movies. It includes features for adding, editing, deleting, and searching movies. The application uses Thymeleaf for rendering views and Lombok for reducing boilerplate code.

## Dependencies

The project uses the following dependencies:

- **Spring Boot Starter**: Core starter, including auto-configuration support, logging, and YAML.
- **Spring Boot Starter Test**: Starter for testing Spring Boot applications with libraries including JUnit, Hamcrest, and Mockito.
- **Lombok**: Java library that helps to reduce boilerplate code.
- **Spring Boot Starter Data JPA**: Starter for using Spring Data JPA with Hibernate.
- **MySQL Connector**: JDBC driver for MySQL.
- **Spring Boot Starter Web**: Starter for building web, including RESTful, applications using Spring MVC.
- **Spring Boot Starter Thymeleaf**: Starter for building MVC web applications using Thymeleaf views.
- **Spring Boot DevTools**: Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

## Features

- **Add Movie**: Add new movies to the collection.
- **Edit Movie**: Edit existing movies in the collection.
- **Delete Movie**: Delete movies from the collection.
- **Search Movie**: Search for movies by title.

## Project Structure

### Main Application

```java
package application.lab3bis;

import application.lab3bis.Repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab3bisApplication {
    public static void main(String[] args) {
        SpringApplication.run(Lab3bisApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(MovieRepository movieRepository) {
        return args -> {
            // movieRepository.saveAll(SampleMovieData.getSampleMovies());
        };
    }
}
```

### Controllers

```java
// filepath: c:\Users\yahya\OneDrive\Documents\SDIA\S2\J2E\Lab-3bis\src\main\java\application\lab3bis\Controllers\MovieController.java
package application.lab3bis.Controllers;

import application.lab3bis.Exceptions.MovieExceptions.MovieNotFoundException;
import application.lab3bis.Models.Movie;
import application.lab3bis.Repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/movies")
@AllArgsConstructor
public class MovieController {
    // ...existing code...
}
```

### Models

```java
// filepath: c:\Users\yahya\OneDrive\Documents\SDIA\S2\J2E\Lab-3bis\src\main\java\application\lab3bis\Models\Movie.java
package application.lab3bis.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Movie {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String title;
    private String director;
    private int releaseYear;
    private String genre;
    private String description;
    private String img_url;
}
```

### Repositories

```java
// filepath: c:\Users\yahya\OneDrive\Documents\SDIA\S2\J2E\Lab-3bis\src\main\java\application\lab3bis\Repositories\MovieRepository.java
package application.lab3bis.Repositories;

import application.lab3bis.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, String> {
    List<Movie> findMoviesByTitleContaining(String keyword);
}
```

### DTOs and Mappers

```java
// filepath: c:\Users\yahya\OneDrive\Documents\SDIA\S2\J2E\Lab-3bis\src\main\java\application\lab3bis\DTOs\MovieDTO.java
package application.lab3bis.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class MovieDTO {
    private String id;
    private String title;
    private String description;
}
```

```java
// filepath: c:\Users\yahya\OneDrive\Documents\SDIA\S2\J2E\Lab-3bis\src\main\java\application\lab3bis\DTOs\MovieMapper.java
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
```

### Exceptions

```java
// filepath: c:\Users\yahya\OneDrive\Documents\SDIA\S2\J2E\Lab-3bis\src\main\java\application\lab3bis\Exceptions\MovieExceptions\MovieNotFoundException.java
package application.lab3bis.Exceptions.MovieExceptions;

public class MovieNotFoundException extends MovieException {
    public MovieNotFoundException(String message) {
        super(message);
    }
    public MovieNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
```

### Sample Data

```java
// filepath: c:\Users\yahya\OneDrive\Documents\SDIA\S2\J2E\Lab-3bis\src\main\java\application\lab3bis\Assets\SampleMovieData.java
package application.lab3bis.Assets;

import application.lab3bis.Models.Movie;

import java.util.ArrayList;
import java.util.List;

public class SampleMovieData {
    public static List<Movie> getSampleMovies() {
        List<Movie> movieList = new ArrayList<>();
        // ...existing code...
        return movieList;
    }
}
```

### Views

```html
// filepath: c:\Users\yahya\OneDrive\Documents\SDIA\S2\J2E\Lab-3bis\src\main\resources\templates\movies.html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <!-- ...existing code... -->
</head>
<body>
<div class="container">
    <header class="page-header">
        <!-- ...existing code... -->
    </header>
    <main>
        <div class="movie-grid" th:if="${not #lists.isEmpty(movies)}">
            <div class="movie-tile" th:each="movie : ${movies}">
                <img th:src="${movie.img_url}" th:alt="${movie.title} + ' poster'">
                <a th:text="${movie.title}" th:href="@{/movies/{id}(id=${movie.id})}">Movie Title</a>
            </div>
        </div>
        <div th:if="${#lists.isEmpty(movies)}" class="no-movies">
            <p>No movies available in the collection.</p>
        </div>
    </main>
</div>
</body>
</html>
```

