package BookMyShow.Models;

import BookMyShow.Constants.SeatStatus;
import BookMyShow.Constants.SeatType;
import jakarta.persistence.Entity;

@Entity
public class Seat extends BaseModel{
    private int row;
    private int col;
    private String seatNo;
    private SeatType seatType;
    private SeatStatus seatStatus;
}
