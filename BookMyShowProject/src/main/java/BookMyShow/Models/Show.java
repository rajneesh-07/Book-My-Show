package BookMyShow.Models;

import BookMyShow.Constants.ShowStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Show extends BaseModel{
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    private Auditorium auditorium;
    @OneToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private Movie movie;
    private String language;
    private ShowStatus showStatus;

}
