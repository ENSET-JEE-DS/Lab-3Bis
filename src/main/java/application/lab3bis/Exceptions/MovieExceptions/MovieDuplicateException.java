package application.lab3bis.Exceptions.MovieExceptions;

public class MovieDuplicateException extends RuntimeException {
    public MovieDuplicateException(String message) {
        super(message);
    }
    public MovieDuplicateException(String message, Throwable cause) {
        super(message, cause);
    }
}
