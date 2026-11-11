package BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class City extends BaseModel{
    private String name;
    @OneToMany
    private List<Theater> theaters;

}
