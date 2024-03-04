package ma.ensa.flottproject1.repository;

import ma.ensa.flottproject1.entities.conducteur.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository extends JpaRepository<Formation,Long> {
}
