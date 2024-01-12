package entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WorkStation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private WorkStationType workStationType;
    private int maxOccupation;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;

    public WorkStation(String description, WorkStationType workStationType, int maxOccupation, Office office) {
        this.description = description;
        this.workStationType = workStationType;
        this.maxOccupation = maxOccupation;
        this.office = office;
    }
}
