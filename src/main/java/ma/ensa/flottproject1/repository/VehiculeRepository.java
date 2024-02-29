package ma.ensa.flottproject1.repository;

import ma.ensa.flottproject1.entities.vehicule.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule,String> {
}
