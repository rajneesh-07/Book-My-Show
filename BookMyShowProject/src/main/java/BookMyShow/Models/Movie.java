package BookMyShow.Models;

import BookMyShow.Constants.MovieType;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Movie extends BaseModel{
    private String name;
    private double lengthInMinutes;
    private String language;
    private List<MovieType> movieType;
}
