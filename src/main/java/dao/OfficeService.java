package dao;

import entities.Office;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OfficeService {
    @Autowired
    OfficeDAO officeDAO;

    public void save(Office office) {
        officeDAO.save(office);
        log.info("Office saved successfully!");
    }
}
