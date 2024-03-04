package ma.ensa.flottproject1.repository;

import ma.ensa.flottproject1.entities.conducteur.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience,Long> {

}
