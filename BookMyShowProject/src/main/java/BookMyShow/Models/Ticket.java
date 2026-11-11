package BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Ticket extends BaseModel{
    private LocalDateTime bookingTime;
    private double totalCost;
    @OneToMany
    private List<Show> shows;
    @ManyToOne
    private User user;

}
