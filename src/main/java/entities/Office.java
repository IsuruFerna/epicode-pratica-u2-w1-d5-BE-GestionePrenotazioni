package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Office {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;
    private String city;

    @NonNull
    @OneToMany(mappedBy = "office", cascade = CascadeType.ALL)
    private Set<WorkStation> workStations;

    public Office(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }
}
