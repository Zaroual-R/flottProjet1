package ma.ensa.flottproject1.repository;

import ma.ensa.flottproject1.entities.consommation.BonConsommation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  BonRepository extends JpaRepository<BonConsommation,Long> {

}
