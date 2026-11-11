package BookMyShow.Models;

import BookMyShow.Constants.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Payment extends  BaseModel{
    private LocalDateTime paymentTime;
    @OneToOne
    private Ticket ticket;
    private String paymentRefNo;
    private double totalAmount;
    private List<Transaction> transactions;
    private PaymentStatus paymentStatus;
}
