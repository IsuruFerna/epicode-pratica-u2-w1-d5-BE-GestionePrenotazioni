package epicode.GestionePrenotazioni;

import com.github.javafaker.Faker;
import dao.OfficeService;
import entities.Office;
import entities.WorkStation;
import entities.WorkStationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Spliterator;

@Component
public class ApplicationRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(GestionePrenotazioniApplication.class);





//        officeService.save(ctx.getBean("of1", Office.class));

//        WorkStation w1 = new WorkStation(
//                "description",
//                WorkStationType.MEETING_ROOM,
//                20,
//                of1);
//
//        System.out.println(w1);

    }
}
