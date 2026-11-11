package BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class User extends BaseModel{
    private String name;
    private String email;
    @OneToMany
    private List<Ticket> tickets;
    private String password;
}
