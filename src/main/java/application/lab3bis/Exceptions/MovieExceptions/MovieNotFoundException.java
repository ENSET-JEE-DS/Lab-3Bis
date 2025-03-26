package application.lab3bis.Exceptions.MovieExceptions;

public class MovieNotFoundException extends  MovieException{
    public MovieNotFoundException(String message) {
        super(message);
    }
    public MovieNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
