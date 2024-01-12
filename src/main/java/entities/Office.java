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
public abstract class Office {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String address;
    private String city;

    public Office(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }
}
