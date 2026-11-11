package BookMyShow.Models;

import BookMyShow.Constants.TransactionStatus;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class Transaction extends BaseModel{
    private double amount;
    private LocalDateTime transactionTime;
    private String transactionRefNo;
    private TransactionStatus transactionStatus;
    private String transactionMode;
}
