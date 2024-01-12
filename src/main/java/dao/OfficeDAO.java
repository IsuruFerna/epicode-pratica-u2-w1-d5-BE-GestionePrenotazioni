package dao;

import entities.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeDAO extends JpaRepository<Office, Long> {
}
