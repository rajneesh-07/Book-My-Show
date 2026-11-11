package BookMyShow.Models;

import BookMyShow.Constants.AuditoriumType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;

    private List<AuditoriumType> auditoriumTypes;
}
