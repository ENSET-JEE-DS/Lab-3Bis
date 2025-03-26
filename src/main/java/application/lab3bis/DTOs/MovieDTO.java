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
