package BookMyShow.Models;

import BookMyShow.Constants.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class ShowSeat extends BaseModel{
    private int price;
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
}
