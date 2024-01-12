package epicode.GestionePrenotazioni;

import com.github.javafaker.Faker;
import entities.Office;
import entities.WorkStation;
import entities.WorkStationType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world2!");

        Faker faker = new Faker();

        WorkStation w1 = new WorkStation(
                faker.company().name(),
                faker.address().fullAddress(),
                faker.address().city(),
                "description",
                WorkStationType.MEETING_ROOM,
                20);

        System.out.println(w1);

    }
}
