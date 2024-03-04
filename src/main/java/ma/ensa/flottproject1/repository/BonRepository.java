package ma.ensa.flottproject1.repository;

import ma.ensa.flottproject1.entities.consommation.BonConsommation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BonRepository extends JpaRepository<BonConsommation,Long> {

}
