package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WorkStation extends Office{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private WorkStationType workStationType;
    private int maxOccupation;

    public WorkStation(String name, String address, String city, String description, WorkStationType workStationType, int maxOccupation) {
        super(name, address, city);
        this.description = description;
        this.workStationType = workStationType;
        this.maxOccupation = maxOccupation;
    }
}
