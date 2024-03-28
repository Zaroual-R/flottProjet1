package ma.ensa.flottproject1.repository;

import ma.ensa.flottproject1.entities.conducteur.Permis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PermisRepository extends JpaRepository<Permis,Long> {
    Optional<Permis> findByNumeroPermis(String numeroPermis);
}
