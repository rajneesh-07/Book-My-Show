package BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Theater extends BaseModel{
    private String name;
    private String address;
    @OneToMany
    private List<Auditorium> auditoriums;
}
