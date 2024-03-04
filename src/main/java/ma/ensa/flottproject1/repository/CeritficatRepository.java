package ma.ensa.flottproject1.repository;

import ma.ensa.flottproject1.entities.conducteur.Certificat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CeritficatRepository extends JpaRepository<Certificat,Long> {
}
