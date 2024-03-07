package ma.ensa.flottproject1.repository;

import ma.ensa.flottproject1.entities.conducteur.Conducteur;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConducteurRepository extends JpaRepository<Conducteur,Long> {
    public Optional<Conducteur> findConducteurByMatricule(String matricule);

    boolean existsByMatricule(String matricule);
}
