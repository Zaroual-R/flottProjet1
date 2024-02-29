package ma.ensa.flottproject1.repository;

import ma.ensa.flottproject1.entities.voyage.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoyageRepository extends JpaRepository<Voyage,Long> {
}
