package ma.ensa.flottproject1.repository;

import ma.ensa.flottproject1.entities.conducteur.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConducteurRepository extends JpaRepository<Conducteur,Long> {
}
